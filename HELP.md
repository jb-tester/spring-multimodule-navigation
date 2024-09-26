Navigate To Autowired Candidates gutter action doesn't work 
for the components autowired in the different module beans.


Check the repository and service classes in the `jpa-module`

If you edit the JpaModuleConfig class so that few annotations 
``
@EnableJpaRepositories
@EntityScan
@Configuration
``
are used instead of the 
single `@EnableAutoConfiguration` or `@SpringBootApplication` annotation,
the bug goes away