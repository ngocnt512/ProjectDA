package com.example.demo.controller;

import com.example.demo.Repository.ass1.KhachHangRepository;
import com.example.demo.entities.KhachHang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class KhachHangController {

    private KhachHangRepository khRepo = new KhachHangRepository();

    @RequestMapping("khach-hang/create")
    public String create() {
        return "khach_hang/create";
    }

    @PostMapping("khach-hang/store")
    public String store(KhachHang kh) {
        this.khRepo.create(kh);
        return "redirect:/khach-hang/index";
    }

    @GetMapping("khach-hang/index")
    public String index(Model model) {
        List<KhachHang> list = this.khRepo.findAll();
        model.addAttribute("kh", list);
        return "khach_hang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.khRepo.deleteById(id);
        return "redirect:/khach-hang/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        KhachHang khachHang = this.khRepo.findById(id);
        model.addAttribute("data", khachHang);
        return "khach_hang/edit";
    }

    @PostMapping("update/{id}")
    public String update(KhachHang kh) {
        this.khRepo.update(kh);
        return "redirect:/khach-hang/index";
    }


}
