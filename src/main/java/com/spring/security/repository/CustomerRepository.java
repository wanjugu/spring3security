package com.spring.security.repository;

import com.spring.security.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Long> {

    List<Customers> findByEmail(String email);
    
}
