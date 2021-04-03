package com.coin.cryptocurrency.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CryptoCurrencyMap {

    private String id;
    private String name;
    private String symbol;
    private String is_active;
    private String status;
    private String first_historical_data;
    private String last_historical_data;
    private CryptoCurrencyPlatform platform;

}
