package com.atam.service;

import com.atam.dto.request.GirisRequestDto;
import com.atam.dto.request.KullaniciKayitRequestDto;
import com.atam.mapper.KullaniciMapper;
import com.atam.repository.KullaniciRepository;
import com.atam.repository.entity.Kullanici;
import com.atam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class KullaniciServisi extends ServiceManager<Kullanici,Long>implements Serializable {
    private final KullaniciRepository kullaniciRepository;

    public KullaniciServisi(KullaniciRepository kullaniciRepository) {
        super(kullaniciRepository);
        this.kullaniciRepository = kullaniciRepository;
    }
    public Boolean saveDto(KullaniciKayitRequestDto dto) {
        save(KullaniciMapper.INSTANCE.toKullanici(dto));
        return true;
    }
    public String giris(GirisRequestDto dto) {
        Optional<Kullanici> kullanici = kullaniciRepository.findOptionalByKullaniciadiAndSifre(dto.getKullaniciadi(), dto.getSifre());
        return "Başarılı bir şekilde giriş yapıldı.";
    }
    public List<Kullanici> findAll() {
        return kullaniciRepository.findAll();
    }

}
