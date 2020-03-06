package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructorsConstructor(){
        Instructors instru1 = Instructors.getInstance();

        Assert.assertTrue(instru1.getInstance() instanceof Instructors);
    }
}
