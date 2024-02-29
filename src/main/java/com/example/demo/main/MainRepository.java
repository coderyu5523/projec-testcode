package com.example.demo.main;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class MainRepository {
    private final EntityManager em;


    public List<Main> findAll() {

        Query query = em.createNativeQuery("select * from main_tb",Main.class);
        return query.getResultList();

//        try {
//            return query.getResultList();
//        } catch (Exception e) {
//            return null;
//        }
    }
}
