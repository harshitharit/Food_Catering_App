package com.harshit.restaurant.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Restaurants")
public class Restaurant {
    @Id
    private int id;
    private String restaurantName;
    private String restaurantAddress;
    private int phoneNumber;

}
