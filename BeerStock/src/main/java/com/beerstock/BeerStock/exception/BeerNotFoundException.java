package com.beerstock.BeerStock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerNotFoundException extends Exception {
    super(String.format("Beer with name  %s not found", beerName));

    }
