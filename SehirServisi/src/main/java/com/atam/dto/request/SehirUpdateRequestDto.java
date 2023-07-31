package com.atam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SehirUpdateRequestDto {
    @NotBlank
    private String ad;
    private String nüfus;
    private String kıta;
}
