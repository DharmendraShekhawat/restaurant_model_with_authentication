package com.dharmendra.restaurant_model.repo;

import com.dharmendra.restaurant_model.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> myRestaurant(){
        return restaurantList;
    }
}
