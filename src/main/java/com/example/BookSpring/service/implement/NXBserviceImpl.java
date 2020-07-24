package com.example.BookSpring.service.implement;

import com.example.BookSpring.entity.NHAXUATBAN;
import com.example.BookSpring.repository.NXBrepository;
import com.example.BookSpring.service.NXBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class NXBserviceImpl implements NXBservice {
    @Autowired
    NXBrepository nxBrepository;

    public List<NHAXUATBAN> Getnxb(){
        return nxBrepository.findAll();
    }


}
