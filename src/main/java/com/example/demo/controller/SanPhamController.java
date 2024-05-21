package com.example.demo.controller;

import com.example.demo.Repository.ass1.SanPhamRepository;
import com.example.demo.entities.SanPham;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("san-pham")
public class SanPhamController {

    private SanPhamRepository spRepo = new SanPhamRepository();

    @GetMapping("index")
    public String index(Model model) {
        List<SanPham> ds = this.spRepo.findAll();
        model.addAttribute("data", ds);
        return "san_pham/index";
    }

    @RequestMapping("create")
    public String create() {
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(Model model, @Valid SanPham sp, BindingResult validateResult) {
        if (validateResult.hasErrors()) {
            List<FieldError> fieldErrors = validateResult.getFieldErrors();
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : fieldErrors) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            model.addAttribute("errors", errors);
            model.addAttribute("data", sp);
            return "san_pham/create";
        }
        this.spRepo.create(sp);
        return "redirect:/san-pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.spRepo.deleteById(id);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        SanPham sanPham = this.spRepo.findById(id);
        model.addAttribute("data", sanPham);
        return "san_pham/edit";
    }

    @PostMapping("update/{id}")
    public String update(SanPham sp) {
        this.spRepo.update(sp);
        return "redirect:/san-pham/index";
    }

}
