package com.atam.controller;

import com.atam.dto.request.SehirEklemeRequestDto;
import com.atam.repository.entity.Sehir;
import com.atam.service.SehirServisi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.atam.constant.EndPoints.*;

@RestController
@RequestMapping(SEHIR)
@RequiredArgsConstructor
public class SehirController {
    private final SehirServisi sehirServisi;

    @PostMapping(ADD)
    public ResponseEntity<String> ekle(@RequestBody SehirEklemeRequestDto dto){
        return ResponseEntity.ok(sehirServisi.ekle(dto));
    }
    @GetMapping(BLUR)
    public ResponseEntity<Optional<Sehir>> getir(@PathVariable Long sehirid){
        return ResponseEntity.ok(sehirServisi.findById(sehirid));
    }

}
