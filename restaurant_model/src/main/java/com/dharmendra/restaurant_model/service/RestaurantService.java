package com.dharmendra.restaurant_model.service;

import com.dharmendra.restaurant_model.entity.Restaurant;
import com.dharmendra.restaurant_model.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
@Autowired
RestaurantRepo restaurantRepo;
    public String addRestaurant(Restaurant restaurant) {

        restaurantRepo.myRestaurant().add(restaurant);
        return "Restaurant Added Successfully";
    }

    public String addAllRestaurant(List<Restaurant> restaurants) {

        for(Restaurant restaurant : restaurants){
            addRestaurant(restaurant);
        }
       return restaurants.size() + " Restaurants Added Successfully";
    }

    public List<Restaurant> AllRestaurant() {
        return restaurantRepo.myRestaurant();
    }

    public Restaurant getRestaurant(Integer restaurantId) {

        for(Restaurant restaurant : restaurantRepo.myRestaurant()){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                return restaurant;
            }
        }
        return null;
    }

    public String updateRestaurant(Restaurant myRestaurant) {

        for(Restaurant restaurant : restaurantRepo.myRestaurant()){
            if(restaurant.getRestaurantId().equals(myRestaurant.getRestaurantId())){
//                Restaurant restaurant = Restaurant.builder()
//                        .restaurantId(myRestaurant.getRestaurantId())
//                        .restaurantName(myRestaurant.getRestaurantName())
//                        .contactNumber(myRestaurant.getContactNumber())
//                        .speciality(myRestaurant.getSpeciality())
//                        .address(myRestaurant.getAddress())
//                        .totalStuff(myRestaurant.getTotalStuff())
//                        .build();
    restaurant.setRestaurantId(myRestaurant.getRestaurantId());
    restaurant.setRestaurantName(myRestaurant.getRestaurantName());
    restaurant.setTotalStuff(myRestaurant.getTotalStuff());
    restaurant.setAddress(myRestaurant.getAddress());
    restaurant.setSpeciality(myRestaurant.getSpeciality());
    restaurant.setContactNumber(myRestaurant.getContactNumber());

                return myRestaurant.getRestaurantId() + "  Updated Successfully";
            }
        }
        return "Invalid id";
    }

    public String deleteRestaurant(Integer id) {

        for(Restaurant rest : restaurantRepo.myRestaurant()){
            if(rest.getRestaurantId().equals(id)){
                restaurantRepo.myRestaurant().remove(rest);

                return id + " Deleted Successfully";
            }
        }
        return "Invalid "+ id;
    }
}
