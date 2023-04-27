package pashtetpashtetovv.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import pashtetpashtetovv.entity.User;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepo extends ReactiveCrudRepository<User, String>{

    Mono<User> findByEmail(String email);

    Mono<UserDetails> findByUsername(String username);

}
