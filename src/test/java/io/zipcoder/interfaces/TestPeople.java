package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    Student stu1 = new Student(1001,"stu1");
    Student stu2 = new Student(2001,"stu1");
    Student stu3 = new Student(3003,"stu1");
    Student stu4 = new Student(4004,"stu1");

    Instructor teacher1 = new Instructor(5005,"teacher1");
    Instructor teacher2 = new Instructor(6006,"teacher2");
    Instructor teacher3 = new Instructor(7007,"teacher3");
    Instructor teacher4 = new Instructor(8008,"teacher4");

    @Test
    public void testAdd(){
        Students stus = Students.getInstance();
        Integer expectSize1 = 4;
        Integer actualSize1 = stus.getPersonList().size();
        Assert.assertEquals(expectSize1 ,actualSize1);

        stus.add(stu1);
        stus.add(stu2);
        Integer expectSize2 = 6;
        Integer actualSize2 = stus.getPersonList().size();
        Assert.assertEquals(expectSize2 ,actualSize2);
    }
    @Test
    public void testRemove(){
        Students stus = Students.getInstance();

        stus.add(stu3);

        stus.remove(3003);


        Assert.assertNull(stus.findById(3003));

    }
    @Test
    public void testFindById(){
        Students stus = Students.getInstance();

        Assert.assertTrue(stus.findById(1111) instanceof Student);
    }
    @Test
    public void testContains(){
        Students stus = Students.getInstance();
        Assert.assertFalse(stus.contains(stu1));
        stus.add(stu1);
        Assert.assertTrue(stus.contains(stu1));
    }
    /*
    @Test
    public void testRemoveAll(){
        Students stus = Students.getInstance();

        stus.removeAll();
        Assert.assertTrue(stus.count() == 0);
    }
    */

}
