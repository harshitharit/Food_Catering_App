package com.harshit.restaurant.Controller;


import com.harshit.restaurant.DTO.RestaurantDTO;
import com.harshit.restaurant.ExceptionHandling.RestaurantException;
import com.harshit.restaurant.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/restaurants")
@Validated
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;


    @PostMapping("create")
    public ResponseEntity<?>createRestaurant(@RequestBody RestaurantDTO restaurantDTO)throws RestaurantException{
      return new ResponseEntity<>((restaurantService.createRestaurant(restaurantDTO)),HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<String>getRestaurant(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
