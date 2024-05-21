package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamChiTiet {

    private Integer id;

    private String ma;

    private String ms;

    private String kt;

    private String sl;

    private String dg;

    private int trangThai;

}
