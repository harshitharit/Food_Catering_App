package com.harshit.restaurant.Service;


import com.harshit.restaurant.DTO.RestaurantDTO;
import com.harshit.restaurant.ExceptionHandling.RestaurantException;
import com.harshit.restaurant.Model.Restaurant;
import com.harshit.restaurant.Repository.RestaurantRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
   public Restaurant getRestaurantById(int id)throws RestaurantException{
        return restaurantRepository.findById(id);
    }

    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
        Restaurant restaurant=modelMapper.map(restaurantDTO, Restaurant.class);
      Restaurant savedrestaurant =restaurantRepository.save(restaurant);
    return modelMapper.map(savedrestaurant, RestaurantDTO.class);
    }
}
