package com.mytests.spring.appmodule;

import com.mytests.spring.jpamodule.JpaModuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

// same results in case of @Import and in case of scanning
// beans in local extra scanned package are ok
@SpringBootApplication(scanBasePackages = {"com.mytests.spring.appmodule", "com.mytests.spring.jpamodule", "com.mytests.spring.extrapackage"})
//@Import(JpaModuleConfig.class)
public class AppModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppModuleApplication.class, args);
    }

}
