package com.mytests.spring.jpamodule;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// navigate to autowired candidates should suggest both module-local injection and
// the injection in the `app-module` controller class
// actually only local injection is recognized
public interface FooEntityRepository extends CrudRepository<FooEntity, Integer> {

    List<FooEntity> findAll();


    FooEntity findFirstBy();
}
