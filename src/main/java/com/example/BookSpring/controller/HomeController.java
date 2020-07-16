package com.example.BookSpring.controller;

import com.example.BookSpring.entity.CHUDE;
import com.example.BookSpring.entity.SACH;
import com.example.BookSpring.service.CHUDEservice;
import com.example.BookSpring.service.SACHservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class HomeController {
    @Autowired
    private SACHservice sacHservice;
    @Autowired
    private CHUDEservice chudEservice;

    @RequestMapping("/")
    public String index(Model model)
    {
        List<SACH> saches=sacHservice.getsaches();
        List<CHUDE>chudes=chudEservice.getchude();
        model.addAttribute("saches",saches);
        model.addAttribute("chudes",chudes);

        return "index";
    }


    @RequestMapping(value = "/sachtheocd",method = RequestMethod.GET)
    public String SachTheoChuDe(@RequestParam("MaCD") int macd,Model model)
    {
        List<SACH> saches=sacHservice.SachTheoChuDe(macd);
        List<CHUDE>chudes=chudEservice.getchude();
        model.addAttribute("saches",saches);
        model.addAttribute("chudes",chudes);
        return "index";
    }





}
