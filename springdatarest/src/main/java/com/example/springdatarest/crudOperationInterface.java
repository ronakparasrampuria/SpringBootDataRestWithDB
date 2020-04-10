package com.example.springdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")
public interface crudOperationInterface extends JpaRepository<Alien, Integer> {

}
