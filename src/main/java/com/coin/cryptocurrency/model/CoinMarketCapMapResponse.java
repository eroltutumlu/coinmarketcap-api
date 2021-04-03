package com.coin.cryptocurrency.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CoinMarketCapMapResponse {
    private List<CryptoCurrencyMap> data;
    private Status status;
}
