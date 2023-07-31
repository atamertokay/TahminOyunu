package com.atam.repository;

import com.atam.repository.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KullaniciRepository extends JpaRepository<Kullanici,Long> {

    Optional<Kullanici> findOptionalByKullaniciadiAndSifre(String kullaniciadi, String sifre);
}
