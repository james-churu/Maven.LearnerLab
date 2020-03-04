package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student tempStu = new Student(1234,"tempStu");
        Assert.assertTrue(tempStu instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student tempStu = new Student(1234,"tempStu");
        Assert.assertTrue(tempStu instanceof Person);
    }
    @Test
    public void testLearn(){
        Student tempStu = new Student(1234,"tempStu");

        tempStu.learn(10);

        Assert.assertEquals(10.0f, tempStu.getTotalStudyTime(), 1e-8);
    }
}
