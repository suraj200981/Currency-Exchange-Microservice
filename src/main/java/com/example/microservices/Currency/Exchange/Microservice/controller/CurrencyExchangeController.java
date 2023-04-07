package com.example.microservices.Currency.Exchange.Microservice.controller;

import com.example.microservices.Currency.Exchange.Microservice.model.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getExchangeRate(@PathVariable String from, @PathVariable String to){
        return new CurrencyExchange(1, from.toUpperCase(), to.toUpperCase(), BigDecimal.valueOf(50));
    }

}