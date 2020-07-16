package com.example.BookSpring.repository;

import com.example.BookSpring.entity.CHUDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CHUDErepository extends JpaRepository<CHUDE,Integer> {
}
