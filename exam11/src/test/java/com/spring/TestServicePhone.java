package com.spring;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.ModelPhone;
import com.spring.service.IServicePhone;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServicePhone {
    
    private static ApplicationContext context = null;
    private static IServicePhone phoneservice = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        phoneservice = context.getBean("phoneService", IServicePhone.class);
    }
    
    @Test
    public void testConfiguration() {     
        assertNotNull(phoneservice);            
    }
    
    @Test
    public void testgetPhoneList() {
        List<ModelPhone> result = phoneservice.getPhoneList();        
        assertNotNull(result);            
    }
    
}
