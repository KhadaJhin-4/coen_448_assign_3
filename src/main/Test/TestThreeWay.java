import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestThreeWay {


    @Test
    public void sortTest()
    {
        Comparable[] a = {1,2,3,4,5,6,7};
        Quick3way.sort(a);
    }

    @Test
    public void mainTest()
    {
        String[] b = new String[0];
        Quick3way.main(b);
    }
}
