package com.fds.foodiexpress.dao;

import java.util.List;

import com.fds.foodiexpress.entity.Restaurant;

public interface RestaurantDao {
    void addRestaurant(Restaurant restaurant);
    Restaurant getRestaurantById(int id);
    List<Restaurant> getAllRestaurants();
    void updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int id);
}
