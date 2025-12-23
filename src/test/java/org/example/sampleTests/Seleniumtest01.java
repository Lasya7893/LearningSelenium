package org.example.sampleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Seleniumtest01 {

    @Test
    public void Test01()
    {
        Assert.assertEquals("Lasya", "LasYA");
    }
}
