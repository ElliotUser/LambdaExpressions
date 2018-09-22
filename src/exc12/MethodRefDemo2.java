package exc12;

public class MethodRefDemo2 {
    static  String stringOps(StringFunc sf, String string){
        return sf.func(string);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps strOps  = new MyStringOps();
        outStr = stringOps(strOps::strReverse,inStr);


        System.out.println(inStr);
        System.out.println(outStr);

    }
}
