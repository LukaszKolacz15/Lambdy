package pl.akademiakodu;


import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Calculator {
    public static void main(String[] args) {
//        IntegerMath dodawanie = (a, b) -> a + b;
//        IntegerMath odejmowanie = (a, b) -> a - b;
//        IntegerMath dzielenie = (a, b) -> {
//            if (b == 0) {
//                throw new IllegalArgumentException("Nie dziel przez zero cholero!");
//            }
//            return a / b;
//        };


//        System.out.println(operateBinary(5,10,dodawanie)); //15
//        System.out.println(operateBinary(20,10,odejmowanie)); //10
//        System.out.println(operateBinary(20, 5, dzielenie)); //Jesli b=0 wyrzuca wyjatek


//        ALTERNATYWNA (skrocona) METODA TEGO CO WYZEJ:
        System.out.println(operateBinary(5, 10, (a, b) -> a + b)); //15
        System.out.println(operateBinary(20, 10, (a, b) -> a - b)); //10
        System.out.println(operateBinary(20, 5, (a, b) -> a * b)); //4
        System.out.println(operateBinary(20, 5, (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Nie dziel przez zero cholero!");
            }
            return a / b;
        }));
    }

//    public static int operateBinary(int a, int b, IntegerMath math) {
//        return math.operate(a, b);
//    }

//     CONSUMER NA GOTOWYM INTERFEJSIE (BiFunction) - to samo co powyzej:
//        (Consumer consumer; > ctrl + klick na Consumer > scrol do gory > ctrl + klick na function > dostep do wszystkich wbudowanych interfejsow)

    public static int operateBinary(int a, int b, BiFunction<Integer, Integer, Integer> math) {
        return math.apply(a, b);
    }
}
