package com.atam.service;

import com.atam.manager.SehirManager;
import com.atam.repository.TahminRepository;
import com.atam.repository.entity.Tahmin;
import com.atam.repository.enums.EDurum;
import com.atam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class TahminYonetimServisi extends ServiceManager<Tahmin,Long> {
    private final TahminRepository tahminRepository;
    private final SehirManager sehirManager;

    public TahminYonetimServisi(TahminRepository tahminRepository, SehirManager sehirManager) {
        super(tahminRepository);
        this.tahminRepository = tahminRepository;
        this.sehirManager = sehirManager;
    }

    /*public EDurum tahminYap(String sehirtahmini) {
        if (sehirtahmini.equals(sehirManager))
    }*/
}
