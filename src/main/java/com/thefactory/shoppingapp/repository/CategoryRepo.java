package com.thefactory.shoppingapp.repository;

import com.thefactory.shoppingapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {


}
