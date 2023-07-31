package com.atam.mapper;

import com.atam.dto.request.KullaniciKayitRequestDto;
import com.atam.repository.entity.Kullanici;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KullaniciMapper {
    KullaniciMapper INSTANCE= Mappers.getMapper(KullaniciMapper.class);

    Kullanici toKullanici(final KullaniciKayitRequestDto dto);
}
