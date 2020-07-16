package com.example.BookSpring.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "NHAXUATBAN")
public class NHAXUATBAN {
    @Id
    @Column(name = "MaNXB")
    private int MaNXB;

    @Column(name = "TenNXB")
    private String TenNXB;

    @Column(name = "Diachi")
    private String Diachi;

    @Column(name = "Dienthoai")
    private long Dienthoai;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "nxb")
    List<SACH> saches=new ArrayList<>();

    public NHAXUATBAN() {

    }


    public int getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(int maNXB) {
        MaNXB = maNXB;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String tenNXB) {
        TenNXB = tenNXB;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public long getDienthoai() {
        return Dienthoai;
    }

    public void setDienthoai(long dienthoai) {
        Dienthoai = dienthoai;
    }
}
