package com.atam.service;

import com.atam.repository.SkorRepository;
import com.atam.repository.entity.Skor;
import com.atam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SkorServisi extends ServiceManager<Skor,Long> {
    private final SkorRepository skorRepository;

    public SkorServisi(SkorRepository skorRepository) {
        super(skorRepository);
        this.skorRepository = skorRepository;
    }
}
