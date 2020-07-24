package com.example.BookSpring.service;

import com.example.BookSpring.entity.KHACHHANG;

import java.util.Optional;

public interface KHACHHANGservice {

     Optional<KHACHHANG> getKH(String username,String password);
}
