package com.example.BookSpring.controller.restcontroller;

import com.example.BookSpring.entity.SACH;
import com.example.BookSpring.service.SACHservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class SachController  {
    @Autowired
    SACHservice sacHservice;

    @RequestMapping("/allbook")
    public List<SACH> saches()
    {
        return sacHservice.getsaches();
    }
}
