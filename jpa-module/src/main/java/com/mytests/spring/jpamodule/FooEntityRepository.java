package com.mytests.spring.jpamodule;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface FooEntityRepository extends CrudRepository<FooEntity, Integer> {

    List<FooEntity> findAll();


    FooEntity findFirstBy();
}
