package com.thefactory.shoppingapp.repository;

import com.thefactory.shoppingapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {


}
