import org.junit.Assert;
import org.junit.Test;

public class Exercise7Test {
    @Test
    public void test_enqueue() {
        Exercise7<Integer> queueNumber = new Exercise7<>();
        queueNumber.enqueue(1);
        Assert.assertFalse(queueNumber.isEmpty());
    }

    @Test
    public void test_dequeue() {
        Exercise7<Number> queueNumber = new Exercise7<>();
        Assert.assertNull(queueNumber.dequeue());
        queueNumber.enqueue(1);
        Assert.assertEquals(queueNumber.dequeue(), 1);
    }

    @Test
    public void test_peek() {
        Exercise7<Number> queueNumber = new Exercise7<>();
        Assert.assertNull(queueNumber.peek());
        queueNumber.enqueue(1);
        queueNumber.enqueue(2);
        Assert.assertEquals(queueNumber.peek(), 1);
    }

    @Test
    public void test_isEmpty() {
        Exercise7<Number> queueNumber = new Exercise7<>();
        Assert.assertTrue(queueNumber.isEmpty());
    }
}
