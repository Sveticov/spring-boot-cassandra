package com.sveticov.repository;

import com.sveticov.model.Customer;


import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Sveticov on 1/2/2018.
 */

public interface CustomerRepository extends CrudRepository<Customer, String> {
    @Query(value="SELECT * FROM customer WHERE firstname=?0")
    List<Customer> findByFirstname(String firstname);
//
    @Query("SELECT * FROM customer WHERE age > ?0 ALLOW FILTERING")
    List<Customer> findByAgeGreaterThan(int age);
}
