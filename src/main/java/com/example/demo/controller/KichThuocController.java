package com.example.demo.controller;

import com.example.demo.Repository.ass1.KichThuocRepository;
import com.example.demo.entities.KichThuoc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("kich-thuoc")
public class KichThuocController {

    private KichThuocRepository ktRepo = new KichThuocRepository();

    @GetMapping("index")
    public String index(Model model) {
        List<KichThuoc> list = this.ktRepo.findAll();
        model.addAttribute("data", list);
        return "kich_thuoc/index";
    }

    @RequestMapping("create")
    public String create() {
        return "kich_thuoc/create";
    }

    @PostMapping("store")
    public String store(KichThuoc kt) {
        this.ktRepo.create(kt);
        return "redirect:/kich-thuoc/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.ktRepo.deleteById(id);
        return "redirect:/kich-thuoc/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        KichThuoc kichThuoc = this.ktRepo.findById(id);
        model.addAttribute("data", kichThuoc);
        return "kich_thuoc/edit";
    }

    @PostMapping("update/{id}")
    public String update(KichThuoc kichThuoc) {
        this.ktRepo.update(kichThuoc);
        return "redirect:/kich-thuoc/index";
    }

}
