package com.atam.repository;

import com.atam.repository.entity.Tahmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TahminRepository extends JpaRepository<Tahmin,Long> {
}
