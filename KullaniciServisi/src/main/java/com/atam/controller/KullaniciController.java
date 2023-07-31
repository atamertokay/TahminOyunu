package com.atam.controller;

import com.atam.dto.request.GirisRequestDto;
import com.atam.dto.request.KullaniciKayitRequestDto;
import com.atam.repository.entity.Kullanici;
import com.atam.service.KullaniciServisi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.atam.constant.EndPoints.*;

@RestController
@RequestMapping(KULLANICI)
@RequiredArgsConstructor
public class KullaniciController {
    private final KullaniciServisi kullaniciServisi;

    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save(@RequestBody KullaniciKayitRequestDto dto){
        return ResponseEntity.ok(kullaniciServisi.saveDto(dto));
    }
    @PostMapping(LOGIN)
    public ResponseEntity<String> login(@RequestBody GirisRequestDto dto){
        return ResponseEntity.ok(kullaniciServisi.giris(dto));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Kullanici>> findAll(){
        return ResponseEntity.ok(kullaniciServisi.findAll());
    }

}
