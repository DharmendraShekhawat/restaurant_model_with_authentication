package com.dharmendra.restaurant_model.controller;

import com.dharmendra.restaurant_model.entity.Restaurant;
import com.dharmendra.restaurant_model.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    // Add single restaurant
@PostMapping("restaurant")
    public String addRestaurant(@RequestBody @Valid Restaurant restaurant){

        return restaurantService.addRestaurant(restaurant);
    }

    //  // Add list of restaurants
    @PostMapping("restaurants")
    public String addAll(@RequestBody @Valid List<Restaurant> restaurants){

    return restaurantService.addAllRestaurant(restaurants);
    }

    // Get All Restaurants
    @GetMapping("allRestaurants")
    public List<Restaurant> getAllRestaurants(){

    return restaurantService.AllRestaurant();
    }
    @GetMapping("restaurant/restaurantId/{restaurantId}")
    public Restaurant getRestaurant(@PathVariable @Valid Integer restaurantId){

        return restaurantService.getRestaurant(restaurantId);
    }

    // Update Restaurant details
    @PutMapping("restaurant/update")
    public String updateRestaurant(@RequestBody @Valid Restaurant myRestaurant){

    return restaurantService.updateRestaurant(myRestaurant);
    }

    //Delete Restaurant by restaurantId

    @DeleteMapping("restaurant/delete/{restaurantId}")
    public String deleteRestaurant(@PathVariable @Valid Integer restaurantId){

    return restaurantService.deleteRestaurant(restaurantId);
    }

}
