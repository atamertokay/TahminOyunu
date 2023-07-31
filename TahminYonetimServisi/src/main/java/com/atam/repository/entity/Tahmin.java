package com.atam.repository.entity;

import com.atam.repository.enums.EDurum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tahmin extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sehirtahmini;
    //tahmin durumu:doğgru veya yanlış
    private EDurum durum;
}
