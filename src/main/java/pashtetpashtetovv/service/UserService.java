package pashtetpashtetovv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import pashtetpashtetovv.entity.User;
import pashtetpashtetovv.repo.UserRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService implements ReactiveUserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public Flux<User> getAll(){
        return userRepo.findAll();
    }

    public Mono<User> save(User user){
        String newUsername = user.getUsername();
        userRepo.existsById(newUsername).doOnSuccess(found->{
            if(found){
                Mono.error(new Exception("already exists"));
            }
        }).subscribe();
        user.setAsNew();
        return userRepo.save(user);
    }

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }
}
