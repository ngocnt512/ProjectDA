package com.example.demo.Repository.ass1;

import com.example.demo.entities.KichThuoc;

import java.util.ArrayList;
import java.util.List;

public class KichThuocRepository {

    private List<KichThuoc> kt;

    public KichThuocRepository() {
        this.kt = new ArrayList<>();
        this.kt.add(new KichThuoc(1, "KT01", "S", 1));
        this.kt.add(new KichThuoc(2, "KT02", "M", 0));
        this.kt.add(new KichThuoc(3, "KT03", "L", 1));
    }

    public List<KichThuoc> findAll() {
        return this.kt;
    }

    public void create(KichThuoc kt) {
        this.kt.add(kt);
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.kt.size(); i++) {
            KichThuoc kt = this.kt.get(i);
            if (kt.getId() == id) {
                this.kt.remove(i);
            }
        }
    }

    public KichThuoc findById(int id) {
        for (int i = 0; i < this.kt.size(); i++) {
            KichThuoc kichThuoc = this.kt.get(i);
            if (kichThuoc.getId() == id) {
                return kichThuoc;
            }
        }
        return null;
    }

    public void update(KichThuoc kichThuoc) {
    }

}
