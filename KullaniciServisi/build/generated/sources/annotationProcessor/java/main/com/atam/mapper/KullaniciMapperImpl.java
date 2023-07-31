package com.atam.mapper;

import com.atam.dto.request.KullaniciKayitRequestDto;
import com.atam.repository.entity.Kullanici;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-31T12:24:14+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class KullaniciMapperImpl implements KullaniciMapper {

    @Override
    public Kullanici toKullanici(KullaniciKayitRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Kullanici.KullaniciBuilder<?, ?> kullanici = Kullanici.builder();

        kullanici.kullaniciadi( dto.getKullaniciadi() );
        kullanici.sifre( dto.getSifre() );

        return kullanici.build();
    }
}
