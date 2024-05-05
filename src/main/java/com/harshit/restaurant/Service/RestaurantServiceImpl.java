package com.harshit.restaurant.Service;

import com.harshit.restaurant.DTO.RestaurantDTO;
import com.harshit.restaurant.Model.Restaurant;

public interface RestaurantServiceImpl {

    RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO);
    Restaurant getRestaurantById(int id);
}
