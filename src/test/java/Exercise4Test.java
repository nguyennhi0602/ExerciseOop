import org.junit.Assert;
import org.junit.Test;

public class Exercise4Test {
    @Test
    public void test_push() {
        Exercise4<Integer> stackNumber = new Exercise4<>();
        stackNumber.push(1);
        Assert.assertFalse(stackNumber.isEmpty());
    }

    @Test
    public void test_pop() {
        Exercise4<Integer> stackNumber = new Exercise4<>();
        Assert.assertNull(stackNumber.pop());
        stackNumber.push(2);
        stackNumber.push(4);
        Assert.assertEquals((int) stackNumber.pop(), 4);
    }

    @Test
    public void test_isEmpty() {
        Exercise4<Integer> stackNumber = new Exercise4<>();
        Assert.assertTrue(stackNumber.isEmpty());
    }
}
