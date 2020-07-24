package com.example.BookSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KHACHHANG")
public class KHACHHANG {
    @Id
    @Column(name = "MaKH")
    private int MaKH;

    @Column(name = "HoTen")
    private String HoTen;

    @Column(name = "Taikhoan")
    private String Taikhoan;

    @Column(name = "Matkhau")
    private String Matkhau;

    @Column(name = "Email")
    private String Email;

    @Column(name = "DiachiKH")
    private String DiachiKH;

    @Column(name = "DienthoaiKH")
    private long DienthoaiKH;

    @Column(name = "Ngaysinh")
    private String Ngaysinh;

    public KHACHHANG() {

    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        Taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String matkhau) {
        Matkhau = matkhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiachiKH() {
        return DiachiKH;
    }

    public void setDiachiKH(String diachiKH) {
        DiachiKH = diachiKH;
    }

    public long getDienthoaiKH() {
        return DienthoaiKH;
    }

    public void setDienthoaiKH(long dienthoaiKH) {
        DienthoaiKH = dienthoaiKH;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }
}
