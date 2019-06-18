import java.util.ArrayList;
import java.util.List;

public class Exercise4<T> {
    private List<T> stackNumber = new ArrayList<>();

    public void push(T x) {
        stackNumber.add(x);
    }

    public T pop() {
        if (stackNumber.isEmpty()) {
            return null;
        }
        T result = stackNumber.get(stackNumber.size() - 1);
        stackNumber.remove(stackNumber.get(stackNumber.size() - 1));
        return result;
    }

    public boolean isEmpty() {
        return stackNumber.isEmpty();
    }
}
