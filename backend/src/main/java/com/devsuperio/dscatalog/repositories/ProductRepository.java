package com.devsuperio.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperio.dscatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{


}
