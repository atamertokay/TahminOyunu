package com.atam.repository;

import com.atam.repository.entity.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SehirRepository extends JpaRepository<Sehir,Long> {
    Optional<Sehir> ekle(String ad, String kıta, String nüfus);
}
