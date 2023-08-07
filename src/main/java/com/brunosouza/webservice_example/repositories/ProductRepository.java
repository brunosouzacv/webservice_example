package com.brunosouza.webservice_example.repositories;

import com.brunosouza.webservice_example.entities.Category;
import com.brunosouza.webservice_example.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
