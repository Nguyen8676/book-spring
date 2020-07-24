package com.example.BookSpring.service.implement;

import com.example.BookSpring.entity.KHACHHANG;
import com.example.BookSpring.repository.KHACHHANGrepository;
import com.example.BookSpring.service.KHACHHANGservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class KHACHHANGserviceImpl implements KHACHHANGservice {

    @Autowired
    KHACHHANGrepository khachhanGrepository;


    public Optional<KHACHHANG> getKH(String username,String password){
        return khachhanGrepository.getKH(username,password);
    }
}
