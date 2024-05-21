package com.example.demo.Repository.ass1;

import com.example.demo.entities.SanPhamChiTiet;

import java.util.ArrayList;
import java.util.List;

public class SanPhamChiTietRepository {

    private List<SanPhamChiTiet> ct;

    public SanPhamChiTietRepository() {
        this.ct = new ArrayList<>();
        this.ct.add(new SanPhamChiTiet(1, "SP001", "Màu Đen", "Size M", "18", "200.000", 1));
        this.ct.add(new SanPhamChiTiet(2, "SP002", "Màu Trắng", "Size l", "30", "654.000", 1));
        this.ct.add(new SanPhamChiTiet(3, "SP003", "Màu Xám", "Size S", "34", "245.000", 0));
        this.ct.add(new SanPhamChiTiet(4, "SP004", "Màu Đỏ", "Size XL", "11", "100.000", 1));
    }

    public List<SanPhamChiTiet> findAll() {
        return this.ct;
    }

    public List<SanPhamChiTiet> findByid(int spId) {
        List<SanPhamChiTiet> kq = new ArrayList<>();
        for (SanPhamChiTiet s : ct) {
            if (s.getId() == spId) {
                kq.add(s);
            }
        }
        return kq;
    }

}
