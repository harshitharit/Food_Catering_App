package com.harshit.restaurant.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menuitem")
public class MenuItem {
    @Id
    private String Id;
}
