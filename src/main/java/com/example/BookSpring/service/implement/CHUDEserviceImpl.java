package com.example.BookSpring.service.implement;

import com.example.BookSpring.entity.CHUDE;
import com.example.BookSpring.repository.CHUDErepository;
import com.example.BookSpring.service.CHUDEservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;

@Service
@Transactional
public class CHUDEserviceImpl implements CHUDEservice {
    @Autowired
    CHUDErepository  chudErepository;

    public List<CHUDE> getchude()
    {
        return chudErepository.findAll();
    }
}
