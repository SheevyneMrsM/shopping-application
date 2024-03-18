package com.thefactory.shoppingapp.repository;

import com.thefactory.shoppingapp.model.ShoppingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingOrderRepo extends JpaRepository<ShoppingOrder,Long> {
}
