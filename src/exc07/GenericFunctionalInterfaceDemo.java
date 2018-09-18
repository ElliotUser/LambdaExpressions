package exc07;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) ->{
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Лямбда обращается на " +reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " +reverse.func("Выражение"));

        System.out.println();
        
        
        SomeFunc<Integer> factorial = (n) ->{
            int result = 1;

            for(int i = 1; i <= n ; i++) {
                if(n == 0)
                    return result;
                else
                    result = i * result;
            }
            return result;
        };

        System.out.println("Факториал числа 0 равен "+factorial.func(0));
        System.out.println("Факториал числа 3 равен "+factorial.func(3));
        System.out.println("Факториал числа 5 равен "+factorial.func(5));
    }
}
