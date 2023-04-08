package com.example.microservices.Currency.Exchange.Microservice.controller;

import com.example.microservices.Currency.Exchange.Microservice.model.CurrencyExchange;
import com.example.microservices.Currency.Exchange.Microservice.service.CurrecyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    @Autowired
    Environment environment;
    @Autowired
    CurrecyExchangeService service;

    @GetMapping("/currency-exchange/from/{currencyFrom}/to/{currencyTo}")
    public CurrencyExchange getExchangeRate(@PathVariable String currencyFrom, @PathVariable String currencyTo){
//        CurrencyExchange currencyEsxchange = new CurrencyExchange(1L, currencyFrom.toUpperCase(),
//                currencyTo.toUpperCase(),
//                BigDecimal.valueOf(50));

        CurrencyExchange currencyExchange =service.findCurrencyExchange(currencyFrom.toUpperCase(), currencyTo.toUpperCase());

        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        return currencyExchange;
    }

}
