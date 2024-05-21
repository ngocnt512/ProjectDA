package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NhanVien {

    private Integer id;

    private  String ten;

    private String maNV;

    private String tenDN;

    private String mk;

    private int trangThai ;

}