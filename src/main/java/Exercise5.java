import java.util.ArrayList;
import java.util.List;

public class Exercise5<T> {
    private List<T> queueNumber = new ArrayList<>();

    public void enqueue(T x) {
        queueNumber.add(x);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T result = queueNumber.get(0);
        queueNumber.remove(0);
        return result;
    }

    public T peek() {
        return isEmpty()? null : queueNumber.get(0);
    }

    public boolean isEmpty() {
        return queueNumber.isEmpty();
    }
}
