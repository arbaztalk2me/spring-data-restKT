package com.java.repo;

import com.java.entity.Productss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product-api",path = "product-v1")
public interface ProdRepo extends JpaRepository<Productss,Integer> {
    Productss findByProdName(String name);
    Productss findByProdNameAndPrice(String name,double price);
}
