import org.junit.Assert;
import org.junit.Test;

public class Exercise6Test {

    @Test
    public void test_push() {
        Exercise6<Integer> stackNumber = new Exercise6<>();
        stackNumber.push(10);
        Assert.assertFalse(stackNumber.isEmpty());
    }

    @Test
    public void test_pop() {
        Exercise6<Integer> stackNumber = new Exercise6<>();
        Assert.assertNull(stackNumber.pop());
        stackNumber.push(12);
        stackNumber.push(14);
        Assert.assertEquals((int) stackNumber.pop(), 14);
    }

    @Test
    public void test_isEmpty() {
        Exercise6<Integer> stackNumber = new Exercise6<>();
        Assert.assertTrue(stackNumber.isEmpty());
    }

}
