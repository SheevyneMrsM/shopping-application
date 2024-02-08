package com.thefactory.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingOrder extends JpaRepository<ShoppingOrder,Long> {
}
