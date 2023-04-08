package com.example.microservices.Currency.Exchange.Microservice.service;

import com.example.microservices.Currency.Exchange.Microservice.model.CurrencyExchange;
import com.example.microservices.Currency.Exchange.Microservice.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurrecyExchangeService {


    @Autowired
    private CurrencyExchangeRepository repo;


    public CurrecyExchangeService(){

    }

    public List<CurrencyExchange> getAllCurrencyExchanges(){
        return repo.findAll();
    }

    public CurrencyExchange findCurrencyExchange(String currencyFrom, String currencyTo){
        CurrencyExchange foundValue = repo.findByCurrencyFromAndCurrencyTo(currencyFrom, currencyTo);

        if(foundValue==null){
            throw new RuntimeException("Unable to find data for from: "+ currencyFrom + " to: "+currencyTo);
        }else {
            return foundValue;
        }
    }

}
