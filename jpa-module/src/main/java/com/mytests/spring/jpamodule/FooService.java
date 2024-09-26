package com.mytests.spring.jpamodule;

import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 9/26/2024.</p>
 * *
 */

// navigate to autowired candidates should navogate to the `app-module` controller
@Service
public class FooService {


    private final FooEntityRepository fooEntityRepository;

    public FooService(FooEntityRepository fooEntityRepository) {
        this.fooEntityRepository = fooEntityRepository;
    }



    public void populateDB() {
       fooEntityRepository.save(new FooEntity());
       fooEntityRepository.save(new FooEntity());
       fooEntityRepository.save(new FooEntity());
    }

    ;

}
