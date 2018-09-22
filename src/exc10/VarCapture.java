package exc10;

public class VarCapture {
    public static void main(String[] args) {
        int num= 10;

        MyFunc myLambda = n -> {
            int v = num + n;
//            num++ //Нельзя так
            return v;
        };

//        num = 9; //Нельзя так

    }
}
