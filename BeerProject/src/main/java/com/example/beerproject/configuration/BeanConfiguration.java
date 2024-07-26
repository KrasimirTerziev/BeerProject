package com.example.beerproject.configuration;

import com.example.beerproject.repositories.BeerRepository;
import com.example.beerproject.repositories.BeerRepositoryImpl;
import com.example.beerproject.services.BeerService;
import com.example.beerproject.services.BeerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public BeerService beerService(){
        return new BeerServiceImpl(beerRepository());
    }
    public BeerRepository beerRepository(){
        return new BeerRepositoryImpl();
    }
}
