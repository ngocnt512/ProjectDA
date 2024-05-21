package com.example.demo.controller;

import com.example.demo.Repository.ass1.SanPhamChiTietRepository;
import com.example.demo.Repository.ass1.SanPhamRepository;
import com.example.demo.entities.SanPham;
import com.example.demo.entities.SanPhamChiTiet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("sp-ct")
public class SanPhamChiTietController {

    private SanPhamChiTietRepository spctRepo = new SanPhamChiTietRepository();

    private SanPhamRepository spRepo = new SanPhamRepository();

    @GetMapping("index")
    public String index(Model model) {
        List<SanPhamChiTiet> list = this.spctRepo.findAll();
        List<SanPham> sp = this.spRepo.findAll();
        model.addAttribute("data", list);
        model.addAttribute("sp", sp);

        return "sp_ct/index";
    }

}
