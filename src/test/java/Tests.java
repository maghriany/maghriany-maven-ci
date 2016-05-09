import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mi.maghriani on 5/9/2016.
 */
public class Tests {
    @Test
    public void sumOperationTest(){
        int firstInt = 5;
        int secondInt = 3;
        int result = 8;

        Sum target = new Sum();
        assertEquals(target.sumOfTwoInts(firstInt, secondInt), result);
    }
}
