package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    Student stu1 = new Student(1111,"stu1");
    Student stu2 = new Student(2222,"stu1");
    Student stu3 = new Student(3333,"stu1");
    Student stu4 = new Student(4444,"stu1");

    Instructor teacher1 = new Instructor(5555,"teacher1");
    Instructor teacher2 = new Instructor(6666,"teacher2");
    Instructor teacher3 = new Instructor(7777,"teacher3");
    Instructor teacher4 = new Instructor(8888,"teacher4");

    @Test
    public void testAdd(){
        People group = new People();
        Integer expected1 = 0;
        Assert.assertEquals(expected1,group.count());

        group.add(stu1);
        group.add(stu2);
        Integer expected2 = 2;
        Assert.assertEquals(expected2,group.count());
    }
    @Test
    public void testRemove(){
        People group = new People();
        group.add(stu1);
        group.add(stu2);

        Integer expected1 = 2;
        Assert.assertEquals(expected1,group.count());

        group.remove(stu1); // Remove by Person
        Integer expected2 = 1;
        Assert.assertEquals(expected2,group.count());

        group.remove(2222); // Remove by id
        Integer expected3 = 0;
        Assert.assertEquals(expected3,group.count());
    }
    @Test
    public void testFindById(){
        People group = new People();
        group.add(stu1);

        Person expected = stu1;
        Person actual = group.findById(1111);
        Assert.assertEquals(expected , actual);
    }
    @Test
    public void testContains(){
        People group = new People();
        Assert.assertFalse(group.contains(stu1));

        group.add(stu1);
        Assert.assertTrue(group.contains(stu1));
    }
    @Test
    public void testRemoveAll(){
        People group = new People();
        group.add(stu1);
        group.add(stu2);

        Integer expected1 = 2;
        Assert.assertEquals(expected1,group.count());

        group.removeAll();
        Integer expected2 = 0;
        Assert.assertEquals(expected2,group.count());
    }
    @Test
    public void testToArray(){
        People group = new People();
        group.add(stu1);
        group.add(stu2);

        Person[] expected = {stu1,stu2};
        Person[] actual = group.toArray();

        Assert.assertEquals(expected ,  actual);
    }


}
