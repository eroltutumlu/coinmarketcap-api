package com.coin.cryptocurrency.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Status {
    private String timestamp;
    private Integer error_code;
    private String error_message;
    private Integer elapsed;
    private Integer credit_count;
}