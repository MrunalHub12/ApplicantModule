package com.univapp;

 


import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

 

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.BDDMockito.*;

import com.univapp.entity.Applicant;
import com.univapp.repository.ApplicantDAO;

 


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class UniversityCourseApplicationTests {
    
    @MockBean
    ApplicantDAO srepo;
    
    @Test
    void contextLoads() {
    }
    

 

    
    //view all staff
    @Test
    public void getAllApplicant() {
        List<Applicant> app=new ArrayList();
        app.add(new Applicant());
        given(srepo.findAll()).willReturn(app);
        List<Applicant> expected = (List<Applicant>) srepo.findAll();
        assertEquals(expected, app);
        verify(srepo).findAll();
        
    }
    
    @Test
    public void getAllApplicantById() {
        List<Applicant> app=new ArrayList();
        app.add(new Applicant());
        given(srepo.findAll()).willReturn(app);
        List<Applicant> expected = (List<Applicant>) srepo.findAll();
        assertEquals(expected, app);
        verify(srepo).findAll();
        
        
    }
    
    
 

    
}