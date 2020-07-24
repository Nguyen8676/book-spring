package com.example.BookSpring.controller;

import com.example.BookSpring.entity.CHUDE;
import com.example.BookSpring.entity.KHACHHANG;
import com.example.BookSpring.entity.NHAXUATBAN;
import com.example.BookSpring.entity.SACH;
import com.example.BookSpring.service.KHACHHANGservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
//    @Autowired
//    KHACHHANGservice khachhanGservice;

    @RequestMapping("/user")
    public String UserLogin()
    {
        return "login";
    }

//    @RequestMapping(value = "/getuser", method = RequestMethod.POST)
//    public String editStudent2(@RequestParam("Taikhoan") String username,@RequestParam("Matkhau") String password, Model model ) {
//        Optional<KHACHHANG> khachhang = khachhanGservice.getKH(username,password);
//
//        khachhang.ifPresent(khachhang1 -> model.addAttribute("khachhang1",khachhang1));
//
//        // classRoom.ifPresent(classrooms->model.addAttribute("classrooms",classrooms));
//
//
//        return "redirect:/";
//    }

}
