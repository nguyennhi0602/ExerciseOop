import java.util.ArrayList;
import java.util.List;

public class Exercise7<T> {
    private List<T> queueNumber = new ArrayList<>();

    public List<T> enqueue(T x) {
        queueNumber.add(x);
        return queueNumber;
    }

    public T dequeue() {
        if (queueNumber.isEmpty()) {
            return null;
        }
        T result = queueNumber.get(0);
        queueNumber.remove(0);
        return result;
    }

    public T peek() {
        return queueNumber.isEmpty() ? null : queueNumber.get(0);
    }

    public boolean isEmpty() {
        return this.queueNumber.size() == 0;
    }
}
