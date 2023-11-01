package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Assert;

public class JobTest {


    @Test
    public void testSettingJobId() {


        Job aJobObj1 = new Job();
        Job bJobObj2 = new Job();

        assertNotEquals(bJobObj2.getId(), aJobObj1.getId());

        //TODO: Create your unit tests here


    }

}
