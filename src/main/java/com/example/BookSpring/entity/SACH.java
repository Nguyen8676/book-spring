package com.example.BookSpring.entity;

import javax.persistence.*;

@Entity
@Table(name = "SACH")
public class SACH {
    @Id
    @Column(name = "Masach")
    private int Masach;

    @Column(name = "Tensach")
    private String Tensach;

    @Column(name = "Giaban")
    private double Giaban;

    @Column(name = "Mota")
    private String Mota;

    @Column(name = "Anhbia")
    private String Anhbia;

    @Column(name = "Ngaycapnhat")
    private String Ngaycapnhat;

    @Column(name = "Soluongton")
    private int Soluongton;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaNXB",referencedColumnName="MaNXB")
     NHAXUATBAN nxb;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "MaCD")
    CHUDE cd;

    public SACH() {

    }


    public int getMasach() {
        return Masach;
    }

    public void setMasach(int masach) {
        Masach = masach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double giaban) {
        Giaban = giaban;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getAnhbia() {
        return Anhbia;
    }

    public void setAnhbia(String anhbia) {
        Anhbia = anhbia;
    }

    public String getNgaycapnhat() {
        return Ngaycapnhat;
    }

    public void setNgaycapnhat(String ngaycapnhat) {
        Ngaycapnhat = ngaycapnhat;
    }

    public int getSoluongton() {
        return Soluongton;
    }

    public void setSoluongton(int soluongton) {
        Soluongton = soluongton;
    }
}
