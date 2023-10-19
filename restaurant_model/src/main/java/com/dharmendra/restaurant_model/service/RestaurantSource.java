package com.dharmendra.restaurant_model.service;

import com.dharmendra.restaurant_model.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestaurantSource {


    @Bean
    public List<Restaurant> sourceList(){
        return new ArrayList<>();
    }
}
