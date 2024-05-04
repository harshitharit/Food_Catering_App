package com.harshit.restaurant.Service;

import com.harshit.restaurant.DTO.RestaurantDTO;
import com.harshit.restaurant.Model.Restaurant;

import java.util.List;

public interface RestaurantServiceImpl {
    List<Restaurant>getAllRestaurant();

    RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO);

}
