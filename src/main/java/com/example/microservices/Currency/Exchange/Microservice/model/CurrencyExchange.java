package com.example.microservices.Currency.Exchange.Microservice.model;

import org.springframework.core.env.Environment;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currencyFrom;
    private String currencyTo;
    private BigDecimal conversionMultiple;

    private String environment;

    public CurrencyExchange(){

    }

    public CurrencyExchange(Long id, String currencyFrom, String currencyTo, BigDecimal conversionMultiple) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return currencyFrom;
    }

    public void setFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getTo() {
        return currencyTo;
    }

    public void setTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
