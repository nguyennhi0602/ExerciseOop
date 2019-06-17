import org.junit.Assert;
import org.junit.Test;

public class Exercise5Test {
    @Test
    public void test_enqueue() {
        Exercise5<Integer> queueNumber = new Exercise5<>();
        queueNumber.enqueue(1);
        Assert.assertFalse(queueNumber.isEmpty());
    }

    @Test
    public void test_dequeue() {
        Exercise5<Number> queueNumber = new Exercise5<>();
        Assert.assertNull(queueNumber.dequeue());
        queueNumber.enqueue(1);
        Assert.assertEquals(queueNumber.dequeue(), 1);
    }

    @Test
    public void test_peek() {
        Exercise5<Number> queueNumber = new Exercise5<>();
        Assert.assertNull(queueNumber.peek());
        queueNumber.enqueue(1);
        queueNumber.enqueue(2);
        Assert.assertEquals(queueNumber.peek(), 1);
    }

    @Test
    public void test_isEmpty() {
        Exercise5<Number> queueNumber = new Exercise5<>();
        Assert.assertTrue(queueNumber.isEmpty());
    }
}
