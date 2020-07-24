package com.example.BookSpring.repository;

import com.example.BookSpring.entity.NHAXUATBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NXBrepository extends JpaRepository<NHAXUATBAN,Integer> {
}
