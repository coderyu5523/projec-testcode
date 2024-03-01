package com.example.demo.resume;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ResumeRepository {
        private final EntityManager em;

    public List<ResumeResponse.detailDTO> findByUsernameAndResumeAll(){
        Query  query = em.createNativeQuery("select r.title,r.career, u.id,u.name from resume_tb r inner join user_tb u on r.u_id = u.id ;");

        List<Object[]> results = query.getResultList();
        List<ResumeResponse.detailDTO> responseDTO = new ArrayList<>();

        for(Object[] result :results){

            ResumeResponse.detailDTO dto = new ResumeResponse.detailDTO();
            dto.setTitle((String) result[0]);
            dto.setCareer((String) result[1]);
            dto.setId((Integer) result[2]);
            dto.setName((String) result[3]);
        responseDTO.add(dto);
        }
    return responseDTO;

    }

}
