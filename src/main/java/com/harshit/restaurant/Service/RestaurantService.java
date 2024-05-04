package com.harshit.restaurant.Service;


import com.harshit.restaurant.DTO.RestaurantDTO;
import com.harshit.restaurant.Model.Restaurant;
import com.harshit.restaurant.Repository.RestaurantRepository;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RestaurantService implements RestaurantServiceImpl {
    private final RestaurantRepository restaurantRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository, ModelMapper modelMapper){
        this.restaurantRepository=restaurantRepository;
        this.modelMapper=modelMapper;
    }
    @Override
    public List<Restaurant> getAllRestaurant() {
        return List.of();
    }

    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
        Restaurant restaurant=modelMapper.map(restaurantDTO, Restaurant.class);
      Restaurant savedrestaurant =restaurantRepository.save(restaurant);
    return modelMapper.map(savedrestaurant, RestaurantDTO.class);
    }
}
