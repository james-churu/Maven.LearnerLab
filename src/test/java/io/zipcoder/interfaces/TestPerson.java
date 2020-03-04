package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person tempPerson = new Person(1234,"person1");

        Assert.assertEquals(1234,tempPerson.getID());
        Assert.assertEquals("person1",tempPerson.getName());
    }
    @Test
    public void testSetName(){
        Person tempPerson = new Person(1234,"");
        tempPerson.setName("Jimmy");
        Assert.assertEquals("Jimmy",tempPerson.getName());
    }

}
