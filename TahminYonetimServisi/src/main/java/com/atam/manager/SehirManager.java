package com.atam.manager;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://localhost:7071/api/v1/tahmin",decode404 = true,name = "sehir-tahmin")
public interface SehirManager {
}
