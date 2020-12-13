package com.example.repository;

import com.example.exception.ServiceException;
import com.example.models.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class UserRepository {
    public User getDummyUser(){
        //todo add some user repository and replace dummy user
        return new User(3L, "dummy", "user", LocalDate.now(), null);
    }

    public User getUserById(final Long id){

        if(id > 100){
            throw new ServiceException(404,"user not found", null);
        }

        return new User(id, "dummy-id", "user-id", LocalDate.now().plusMonths(4), null);
    }
}
