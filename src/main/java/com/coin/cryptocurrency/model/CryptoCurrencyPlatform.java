package com.coin.cryptocurrency.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CryptoCurrencyPlatform {
    private String id;
    private String name;
    private String symbol;
    private String token_address;
}
