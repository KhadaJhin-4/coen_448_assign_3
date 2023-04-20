import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class TestTwoWay {
    @Test
    public void selectTest()
    {
        Comparable[] a = {1,2,3,4,5,6,7};
        Comparable j = Quick.select(a,3);
        assertEquals(4,j);
    }

    @Test
    public void selectTestOutofIndex()
    {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Comparable[] a = {1,2,3,4,5,6,7};
                Comparable j = Quick.select(a,-2);
            }
        });
    }


    @Test
    public void sortTest()
    {
        Comparable[] a = {1,2,3,4,5,6,7};
        Quick.sort(a);
    }


    @Test
    public void mainTest()
    {
        String[] b = new String[0];
        String[] a = {"5","6","1","2","3","4","5"};
        Quick.main(b,a);
    }
}
