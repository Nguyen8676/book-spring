package com.example.BookSpring.controller;

import com.example.BookSpring.entity.CHUDE;
import com.example.BookSpring.entity.NHAXUATBAN;
import com.example.BookSpring.entity.SACH;
import com.example.BookSpring.service.CHUDEservice;
import com.example.BookSpring.service.NXBservice;
import com.example.BookSpring.service.SACHservice;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
    @Autowired
    private NXBservice nxBservice;

    @RequestMapping("/")
    public String index(Model model)
    {
        List<SACH> saches=sacHservice.getsaches();
        List<CHUDE>chudes=chudEservice.getchude();
        List<NHAXUATBAN> nxbs=nxBservice.Getnxb();
        model.addAttribute("saches",saches);
        model.addAttribute("chudes",chudes);
        model.addAttribute("nxbs",nxbs);
        return "index";
    }


    @RequestMapping(value = "/sachtheocd",method = RequestMethod.GET)
    public String SachTheoChuDe(@RequestParam("MaCD") int macd,Model model)
    {
        List<SACH> saches=sacHservice.SachTheoChuDe(macd);
        List<CHUDE>chudes=chudEservice.getchude();
        List<NHAXUATBAN> nxbs=nxBservice.Getnxb();
        model.addAttribute("saches",saches);
        model.addAttribute("chudes",chudes);
        model.addAttribute("nxbs",nxbs);
        return "index";
    }

    @RequestMapping(value = "/sachtheonxb",method = RequestMethod.GET)
     public String SachTheoNXB(@RequestParam("MaNXB") int manxb, Model model)
     {
        List<SACH> saches=sacHservice.SachTheoNXB(manxb);
        List<CHUDE>chudes=chudEservice.getchude();
        List<NHAXUATBAN> nxbs=nxBservice.Getnxb();
        model.addAttribute("saches",saches);
        model.addAttribute("chudes",chudes);
        model.addAttribute("nxbs",nxbs);
        return "index";

     }

    @RequestMapping(value = "/chitietsach",method = RequestMethod.GET)
    public String DetailSach(@RequestParam("Masach") int masach,Model model)
    {
        Optional<SACH> sachesDetail=sacHservice.DetailSach(masach);
        sachesDetail.ifPresent(saches -> model.addAttribute("saches",saches));
        return "detailsach";
    }



}
