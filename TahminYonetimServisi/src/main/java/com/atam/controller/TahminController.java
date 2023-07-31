package com.atam.controller;

import com.atam.repository.enums.EDurum;
import com.atam.service.TahminYonetimServisi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.atam.constant.EndPoints.*;

@RestController
@RequestMapping(TAHMIN)
@RequiredArgsConstructor
public class TahminController {
    private final TahminYonetimServisi tahminYonetimServisi;

    @PostMapping(GUESS)
    public ResponseEntity<EDurum> tahminYap(@RequestBody String sehirtahmini){
        return ResponseEntity.ok(tahminYonetimServisi.tahminYap(sehirtahmini));
    }
}
