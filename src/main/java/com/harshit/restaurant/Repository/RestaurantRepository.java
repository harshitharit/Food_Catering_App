package com.harshit.restaurant.Repository;

import com.harshit.restaurant.Model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
    Restaurant findById(int id);
}
