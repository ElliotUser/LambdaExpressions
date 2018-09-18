package exc01;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber num;

        num = () -> 123.45;

        System.out.println(num.getValue());
    }
}
