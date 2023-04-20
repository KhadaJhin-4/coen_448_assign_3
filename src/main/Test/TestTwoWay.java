import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

}
