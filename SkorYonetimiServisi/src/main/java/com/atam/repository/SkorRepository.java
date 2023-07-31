package com.atam.repository;

import com.atam.repository.entity.Skor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkorRepository extends JpaRepository<Skor,Long> {

}
