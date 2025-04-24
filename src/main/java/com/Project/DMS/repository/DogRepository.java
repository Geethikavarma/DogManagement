package com.Project.DMS.repository;

import java.util.*;

//@author Geethika Kolukuluri

import org.springframework.data.repository.CrudRepository;

import com.Project.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
