import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseNumber {

    @Test
    public void test1(){
        Main main = new Main();
        assertEquals( 321, main.reverseNumb(123) );
    }

    @Test
    public void test2(){
        Main main = new Main();
        assertEquals( 3, main.reverseNumb(300) );
    }

    @Test
    public void test3(){
        Main main = new Main();
        assertEquals( -123, main.reverseNumb(-321) );
    }

}
