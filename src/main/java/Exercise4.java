import java.util.ArrayList;
import java.util.List;

public class Exercise4<T> {
    private List<T> stackNumber = new ArrayList<>();

    public void push(T x) {
        stackNumber.add(x);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        int topIndex = stackNumber.size() - 1;
        T result = stackNumber.get(topIndex);
        stackNumber.remove(result);
        return result;
    }

    public boolean isEmpty() {
        return stackNumber.isEmpty();
    }
}
