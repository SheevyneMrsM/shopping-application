package com.thefactory.shoppingapp.repository;

import com.thefactory.shoppingapp.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepo extends JpaRepository<Delivery,Long> {

}
