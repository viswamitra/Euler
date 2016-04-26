package coverage;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by abhiramk on 06/04/16.
 */
public class CoverageExTest {

    CoverageEx coverageEx = new CoverageEx();




    @Test
    public void sumTestWithPositiveResult() {
        int a = 6;
        int b = 10;
        Assert.assertTrue(coverageEx.sum(a, b) == 16);
    }

    @Test
    public void sumTestWithZeroResult() {
        int a = 4;
        int b = 3;
        Assert.assertTrue(coverageEx.sum(a, b)==0);
    }
}
