package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudentsConstructor(){


        Students group = Students.getInstance();
        Student jimmy = group.findById(1111);
        String expected = "jimmy";
        String jimmyName = jimmy.getName();

        Assert.assertEquals(expected , jimmyName);
    }

}
