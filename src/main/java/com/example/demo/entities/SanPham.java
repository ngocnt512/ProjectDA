package com.example.demo.entities;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPham {

    private Integer id;

    @NotBlank(message = "Không được để trống ")
    private String ma;

    @NotBlank(message = "Không được để trống ")
    private String ten;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    private Integer trangThai;

}
