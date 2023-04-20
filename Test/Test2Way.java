import org.junit.*;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test2Way {
    @Test
    public void selectTest()
    {
        Comparable[] a = {1,2,3,4,5,6,7};
        Comparable j = Quick.select(a,3);
        assertEquals(4,j);
    }


    @Test
    public void isSortedTest()
    {

    }
}
