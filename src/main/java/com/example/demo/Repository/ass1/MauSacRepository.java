package com.example.demo.Repository.ass1;

import com.example.demo.entities.MauSac;

import java.util.ArrayList;
import java.util.List;

public class MauSacRepository {

    private List<MauSac> list;

    public MauSacRepository() {
        this.list = new ArrayList<>();
        this.list.add(new MauSac(1, "MS01", "Đen", 1));
        this.list.add(new MauSac(2, "MS02", "Trang", 0));
        this.list.add(new MauSac(3, "MS03", "Đỏ", 1));
    }

    public List<MauSac> findAll() {
        return this.list;
    }

    public void create(MauSac ms) {

        this.list.add(ms);
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            MauSac list = this.list.get(i);
            if (list.getId() == id) {
                this.list.remove(i);
            }
        }
    }

    public MauSac findById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            MauSac mauSac = this.list.get(i);
            if (mauSac.getId() == id) {
                return mauSac;
            }
        }
        return null;
    }

    public void update(MauSac newValue) {
        for (int i = 0; i < this.list.size(); i++) {
            MauSac oldValue = this.list.get(i);
            if (oldValue.getId() == newValue.getId()) {
                this.list.set(i, newValue);
            }
        }
    }
}
