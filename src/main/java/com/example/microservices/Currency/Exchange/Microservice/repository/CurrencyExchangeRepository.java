package com.example.microservices.Currency.Exchange.Microservice.repository;

import com.example.microservices.Currency.Exchange.Microservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

    CurrencyExchange findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
