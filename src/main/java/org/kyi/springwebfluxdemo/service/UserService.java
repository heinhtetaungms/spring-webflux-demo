package org.kyi.springwebfluxdemo.service;

import org.kyi.springwebfluxdemo.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> createUser(User user);
    Flux<User> getAllUsers();
    Mono<User> findById(String userId);
    Mono<User> updateUser(String userId,  User user);
    Mono<User> deleteUser(String userId);
    Flux<User> fetchUsers(String name);
}
