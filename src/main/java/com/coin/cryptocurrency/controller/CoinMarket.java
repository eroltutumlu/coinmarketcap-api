package com.coin.cryptocurrency.controller;

import com.coin.cryptocurrency.service.CoinMarketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("coinmarket")
@AllArgsConstructor
public class CoinMarket {

    private final CoinMarketService coinMarketService;

    @GetMapping(value = "/", produces = "application/json")
    public @ResponseBody String getBook() {
        return coinMarketService.coin();
    }
}
