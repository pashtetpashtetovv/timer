package pashtetpashtetovv.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import pashtetpashtetovv.entity.User;
import pashtetpashtetovv.repo.UserRepo;
import pashtetpashtetovv.utils.Role;
import reactor.core.publisher.Mono;

public class MongoInsert {

    @Autowired
    private UserRepo userRepo;
    private static final Logger log = LoggerFactory.getLogger(MongoInsert.class);

    public Mono<User> saveAdmin(ApplicationArguments args) throws Exception {
        User admin = new User();
        admin.setUsername("123");
        admin.setPassword("{noop}123");
        //admin.setRole(Role.ADMIN);
        Mono<User> savedAdmin = userRepo.save(admin);
        log.info(savedAdmin.block().toString());
        return savedAdmin;

    }

    /*
    @Bean
    public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[]{new ClassPathResource("data.json")});
        return factory;
    }
    */

}
