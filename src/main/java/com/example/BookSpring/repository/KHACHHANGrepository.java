package com.example.BookSpring.repository;

import com.example.BookSpring.entity.KHACHHANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KHACHHANGrepository extends JpaRepository<KHACHHANG,Integer> {

    @Query(value = "select * from KHACHHANG where Taikhoan=?1 and Matkhau=?2",nativeQuery = true)
    Optional<KHACHHANG> getKH(String username,String password);
}
