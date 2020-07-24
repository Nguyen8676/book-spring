package com.example.BookSpring.service;


import com.example.BookSpring.entity.SACH;

import java.util.*;
public interface SACHservice {

    List<SACH> getsaches();

//    List<Sach> GetJsonSach();


    List<SACH> SachTheoChuDe(int macd);


    List<SACH> SachTheoNXB(int manxb);

    Optional<SACH> DetailSach(int masach);
}
