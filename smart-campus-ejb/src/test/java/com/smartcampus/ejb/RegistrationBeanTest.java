package com.smartcampus.ejb;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationBeanTest {

    @Test
    public void testRegisterStudent() {
        RegistrationBean bean = new RegistrationBean();
        String result = bean.registerStudent("John", "Doe", "john.doe@example.com");
        assertTrue(result.contains("registered successfully"));
    }
}

