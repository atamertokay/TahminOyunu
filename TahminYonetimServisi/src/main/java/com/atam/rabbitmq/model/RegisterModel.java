package com.atam.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterModel implements Serializable {
    private Long tahminId;
    private String sehirtahmini;
}
