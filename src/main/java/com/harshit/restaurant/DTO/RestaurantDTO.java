package com.harshit.restaurant.DTO;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {
    private int id;
    @NotNull(message="Name should not be null")
    private String restaurantName;
    @NotNull(message = "Address should not be null")
    private String restaurantAddress;
    @NotNull(message="phont number should not be null")
    private int phoneNumber;
}
