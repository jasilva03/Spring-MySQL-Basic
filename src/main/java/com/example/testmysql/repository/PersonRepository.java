package com.example.testmysql.repository;

import com.example.testmysql.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {



}
