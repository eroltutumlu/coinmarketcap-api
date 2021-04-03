package com.coin.cryptocurrency.service;

import com.coin.cryptocurrency.config.RestTemplateConfig;
import com.coin.cryptocurrency.model.CoinMarketCapMapResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CoinMarketService {

    private final RestTemplateConfig restTemplateConfig;

    public String coin() {
        String uri = "";
        ResponseEntity<CoinMarketCapMapResponse> m2 = restTemplateConfig.coinMarketCapRestTemplate().getForEntity(uri, CoinMarketCapMapResponse.class);
        return "";
    }

}
