package exc02;

public class LambdaDemo2 {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = ()->Math.random() * 100;

        System.out.println("Случайное значение: "+myNumber.getValue());
        System.out.println("Еще одно случайное значение: "+myNumber.getValue());

        //myNumber = ()->"123.45"; //Ошибка
    }
}
