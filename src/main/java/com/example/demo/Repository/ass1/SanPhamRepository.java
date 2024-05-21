package com.example.demo.Repository.ass1;

import com.example.demo.entities.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository {

    private List<SanPham> ds;

    public SanPhamRepository() {
        this.ds = new ArrayList<>();
        this.ds.add(new SanPham(1, "SP01", "Ao Thun", 1));
        this.ds.add(new SanPham(2, "SP02", "Ao Sweeter", 1));
    }

    public List<SanPham> findAll() {
        return this.ds;
    }

    public void create(SanPham sp) {
        this.ds.add(sp);

    }

    public void deleteById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham sp = this.ds.get(i);
            if (sp.getId() == id) {
                this.ds.remove(i);
            }
        }
    }

    public SanPham findById(int id) {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham sp = this.ds.get(i);
            if (sp.getId() == id) {
                return sp;
            }
        }
        return null;
    }

    public void update(SanPham newValue) {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham oldValue = this.ds.get(i);
            if (oldValue.getId() == newValue.getId()) {
                this.ds.set(i, newValue);
            }
        }
    }

}
