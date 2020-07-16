package com.example.BookSpring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CHUDE")
public class CHUDE {
    @Id
    @Column(name = "MaCD")
    private int MaCD;

    @Column(name = "TenChuDe")
    private String TenChuDe;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cd")
    List<SACH> saches=new ArrayList<>();

    public CHUDE() {

    }

    public int getMaCD() {
        return MaCD;
    }

    public void setMaCD(int maCD) {
        MaCD = maCD;
    }

    public String getTenChuDe() {
        return TenChuDe;
    }

    public void setTenChuDe(String tenChuDe) {
        TenChuDe = tenChuDe;
    }
}
