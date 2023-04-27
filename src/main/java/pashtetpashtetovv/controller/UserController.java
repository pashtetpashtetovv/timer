package pashtetpashtetovv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pashtetpashtetovv.entity.User;
import pashtetpashtetovv.entity.dto.UserDTO;
import pashtetpashtetovv.entity.mapper.UserMapper;
import pashtetpashtetovv.service.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public Flux<UserDTO> getAll(){
        return userService.getAll().map(userMapper::toDTO);
    }

    @PostMapping("/register")
    public Mono<UserDTO> register(@RequestBody User user){
        return userService.save(user).map(userMapper::toDTO);
    }

}
