package com.sopra.swag.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.swag.entity.Orders;
@Repository
public interface OrdRepo extends CrudRepository<Orders, Integer> {

}

