package exc14a;

public class ClassConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc<Integer> myClassCons = MyClass::new;

        MyClass<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно "+mc.getVal());
    }
}
