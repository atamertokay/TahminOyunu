package com.atam.service;

import com.atam.dto.request.SaveSehirRequestDto;
import com.atam.dto.request.SehirEklemeRequestDto;
import com.atam.dto.request.SehirUpdateRequestDto;
import com.atam.mapper.SehirMapper;
import com.atam.repository.SehirRepository;
import com.atam.repository.entity.Sehir;
import com.atam.utility.ServiceManager;
import com.fasterxml.jackson.datatype.jdk8.DoubleStreamSerializer;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SehirServisi extends ServiceManager<Sehir,Long> {
    private final SehirRepository sehirRepository;


    public SehirServisi(SehirRepository sehirRepository) {
        super(sehirRepository);
        this.sehirRepository=sehirRepository;
    }

    public String ekle(SehirEklemeRequestDto dto) {
        Optional<Sehir> sehir= sehirRepository.ekle(dto.getAd(),dto.getKıta(),dto.getNüfus());
        return "Sehir başarılı bir şekilde kaydedildi";
    }
    public  Boolean saveSehir(SaveSehirRequestDto dto){
        Sehir sehir= SehirMapper.INSTANCE.toSehir(dto);
            save(sehir);
            return true;
    }


}
