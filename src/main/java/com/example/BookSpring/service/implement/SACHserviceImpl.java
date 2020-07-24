package com.example.BookSpring.service.implement;

import com.example.BookSpring.entity.SACH;
import com.example.BookSpring.repository.SACHrepository;
import com.example.BookSpring.service.SACHservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class SACHserviceImpl implements SACHservice {

    @Autowired
    SACHrepository sacHrepository;


    @Override
    public List<SACH> getsaches()
    {
        return sacHrepository.findAll();
    }

//    @Override
//    public List<Sach> GetJsonSach() {
//        return sacHrepository.GetJsonSach();
//    }

    @Override
    public List<SACH> SachTheoChuDe(int macd)
    {
        return sacHrepository.SachTheoChuDe(macd);
    }

    @Override
    public List<SACH> SachTheoNXB(int manxb){
        return sacHrepository.SachTheoNXB(manxb);
    }

    @Override
    public Optional<SACH> DetailSach(int masach){
        return sacHrepository.findById(masach);
    }

}
