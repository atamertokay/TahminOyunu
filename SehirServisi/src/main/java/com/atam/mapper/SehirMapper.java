package com.atam.mapper;

import com.atam.dto.request.SaveSehirRequestDto;
import com.atam.repository.entity.Sehir;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SehirMapper {
    SehirMapper INSTANCE= Mappers.getMapper(SehirMapper.class);

    Sehir toSehir(final SaveSehirRequestDto dto);
}
