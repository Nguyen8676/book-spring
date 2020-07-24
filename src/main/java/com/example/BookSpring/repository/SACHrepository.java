package com.example.BookSpring.repository;

import com.example.BookSpring.entity.SACH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface SACHrepository extends JpaRepository<SACH,Integer> {

    @Query(value = "select * from SACH a,CHUDE b where a.MaCD=b.MaCD and b.MaCD=?1",nativeQuery = true)
    List<SACH> SachTheoChuDe(int macd);

    @Query(value = "select * from SACH a,NHAXUATBAN b where a.MaNXB=b.MaNXB and b.MaNXB=?1",nativeQuery = true)
    List<SACH> SachTheoNXB(int manxb);

//    @Query(value = "select * from SACH",nativeQuery = true)
//    List<Sach> GetJsonSach();
}
