package com.example.demo.controller;

import com.example.demo.Repository.ass1.MauSacRepository;
import com.example.demo.entities.MauSac;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {

    private MauSacRepository msRepo = new MauSacRepository();

    @GetMapping("index")
    public String index(Model model) {
        List<MauSac> ds = this.msRepo.findAll();
        model.addAttribute("data", ds);
        return "mau_sac/index";
    }

    @RequestMapping("create")
    public String create() {
        return "mau_sac/create";
    }

    @PostMapping("store")
    public String store(MauSac ms) {
        this.msRepo.create(ms);
        return "redirect:/mau-sac/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.msRepo.deleteById(id);
        return "redirect:/mau-sac/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        MauSac mauSac = this.msRepo.findById(id);
        model.addAttribute("data", mauSac);
        return "mau_sac/edit";
    }

    @PostMapping("update/{id}")
    public String update(MauSac ms) {
        this.msRepo.update(ms);
        return "redirect:/mau-sac/index";
    }
}
