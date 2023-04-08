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

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.currencyFrom = from;
        this.currencyTo = to;
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

    public void setFrom(String from) {
        this.currencyFrom = from;
    }

    public String getTo() {
        return currencyTo;
    }

    public void setTo(String to) {
        this.currencyTo = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
