package descendinorder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTest {

    @Test
    public void test_01(){
        assertEquals(0, DescendinOrder.sortDesc(0));
    }

    @Test
    public void test_02(){
        assertEquals(51, DescendinOrder.sortDesc(15));
    }

    @Test
    public void test_03(){
        assertEquals(987654321, DescendinOrder.sortDesc(123456789));
    }
}