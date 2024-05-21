package com.example.demo.Repository.ass1;

import com.example.demo.entities.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository {

    private List<KhachHang> list;

    public KhachHangRepository() {
        this.list = new ArrayList<>();
        this.list.add(new KhachHang(1, "KH001", "Nguyen Van A", "09876543", 1));
        this.list.add(new KhachHang(2, "KH002", "Tran Van B", "0985678", 0));
    }

    public List<KhachHang> findAll() {
        return this.list;
    }

    public void create(KhachHang kh) {
        this.list.add(kh);
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            KhachHang kh = this.list.get(i);
            if (kh.getId() == id) {
                this.list.remove(i);
            }
        }
    }


    public KhachHang findById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            KhachHang kh = this.list.get(i);
            if (kh.getId() == id) {
                return kh;
            }
        }
        return null;
    }

    public void update(KhachHang newValue) {
        for (int i = 0; i < this.list.size(); i++) {
            KhachHang oldValue = this.list.get(i);
            if (oldValue.getId() == newValue.getId()) {
                this.list.set(i, newValue);
            }
        }
    }
}
