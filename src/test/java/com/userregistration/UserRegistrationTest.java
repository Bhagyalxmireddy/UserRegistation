package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTure() {
        Registration register = new Registration();
        boolean result = register.registeredFirstName("Bhagi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenHaveSplChar_ShouldReturnFalse() {
        Registration register = new Registration();
        boolean result = register.registeredFirstName("Bh@gi");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenHaveNum_ShouldReturnFalse() {
        Registration register = new Registration();
        boolean result = register.registeredFirstName("Bhagi123");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenHaveSplCharAndNum_ShouldReturnFalse() {
        Registration register = new Registration();
        boolean result = register.registeredFirstName("Bh@gi11");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        Registration register = new Registration();
        boolean result = register.registeredFirstName("bhagi");
        Assert.assertFalse(result);
    }




}
