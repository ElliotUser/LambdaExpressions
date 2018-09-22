package exc14b;

public class MyClass<T> {
    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public MyClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
