package com.mytests.spring.extrapackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 9/26/2024.</p>
 * *
 */
@Component
public class BarComponent {
    public BarComponent() {
        this.id = id;
    }

    @Value("bar")
    String id;

    public String getId() {
        return id;
    }

}
