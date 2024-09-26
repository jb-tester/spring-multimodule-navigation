package com.mytests.spring.jpamodule;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// if you comment-out the @EnableAutoConfiguration annotation and
// instead uncomment the rest annotations, the bug goes away

@EnableAutoConfiguration
//@EnableJpaRepositories
//@EntityScan
//@Configuration
public class JpaModuleConfig {


}
