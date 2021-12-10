package com.beerstock.BeerStock.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    LAGER("lager"),
    MALZBIER("malzibier"),
    IPA("ipa");

    private final String description;

}
