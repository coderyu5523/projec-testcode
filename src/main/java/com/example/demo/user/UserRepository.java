package com.example.demo.user;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final EntityManager em;


    public List<User> findAll() {
        Query query = em.createNativeQuery("select * from user_tb",User.class);
        List<User> userList = query.getResultList();

        try {
            return userList;
        } catch (Exception e) {
            return null;
        }
    }


}
