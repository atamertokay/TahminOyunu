package com.atam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KullaniciKayitRequestDto {
    @NotBlank(message = "Kullanıcı adı boş geçilemez")
    @Size(min =6 ,max=15  ,message = "Kullanıcı adı enaz 6 karakter en fazla 15 karakter olabilir" )
    private String kullaniciadi;
    @Email
    private  String email;
    @NotBlank(message = "Şifre boş geçilemez")
    @Size(min = 5 ,max=16, message = "Sifre  enaz 5 karakter en fazla 16 karakter olabilir")
    private String sifre;
}
