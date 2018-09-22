package exc14b;

public class ConstructorRefDemo {
    static <R,T> R myClassFactory(MyFunc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass::new;
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно "+mc.getVal());


        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно "+mc2.getStr());

    }
}
