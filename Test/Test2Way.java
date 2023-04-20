import edu.princeton.cs.algs4.Quick;
import org.junit.*;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


public class Test2Way {
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
       }) ;
    }


    @Test
    public void isSortedTest()
    {
        //Quick.sort(a);
    }
}
