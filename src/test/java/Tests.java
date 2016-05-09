import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    public void compareOperationTestMock(){
        Compare mock = mock(Compare.class);
        when(mock.compare()).thenReturn(2);
        int cmp = mock.compare();
        assertEquals(cmp,mock.compare());
    }
}
