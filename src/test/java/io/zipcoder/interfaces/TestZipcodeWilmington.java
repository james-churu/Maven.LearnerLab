package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipcodeWilmington {

    @Test
    public void TestHostLecture(){



        ZipCodeWilmington zpcw = ZipCodeWilmington.getInstance();
        zpcw.hostLecture(Educator.DOLIO , 100.0);
        HashMap<Student , Double> mappy = zpcw.getStudyMap();

        Double expectedHours =  100.00 / mappy.size();

        for( Double value : mappy.values()){
            Assert.assertEquals(expectedHours , value);
        }
    }
}
