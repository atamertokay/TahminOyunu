package com.atam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveSehirRequestDto {
    private String ad;
    private String nüfus;
    private String kıta;
}
