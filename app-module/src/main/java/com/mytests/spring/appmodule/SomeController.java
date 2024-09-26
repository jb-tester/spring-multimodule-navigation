package com.mytests.spring.appmodule;

import com.mytests.spring.extrapackage.BarComponent;
import com.mytests.spring.jpamodule.FooEntity;
import com.mytests.spring.jpamodule.FooEntityRepository;
import com.mytests.spring.jpamodule.FooService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * *
 * <p>Created by irina on 9/26/2024.</p>
 * *
 */
@RestController
public class SomeController {

    private final FooEntityRepository repository;
    private final FooService fooService;
    private final BarComponent barComponent;

    // navigation to injected beans are ok
    public SomeController(FooEntityRepository repository, FooService fooService, Optional<BarComponent> barComponent) {
        this.repository = repository;
        this.fooService = fooService;
        this.barComponent = barComponent.orElse(new BarComponent());
    }

    @GetMapping("/all")
    public List<FooEntity> getAll() {
        System.out.println(barComponent.getId());
        fooService.populateDB();
        return repository.findAll();
    }


}    