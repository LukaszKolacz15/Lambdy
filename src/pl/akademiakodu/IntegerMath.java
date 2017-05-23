package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 22.05.2017.
 */

@FunctionalInterface
public interface IntegerMath {
    int operate(int a, int b);

//    METODY DEFAUKTOWE - cos co nie "musi" byc implementowane przy implementacji interfejsu
    default void makeTest(){
        System.out.println("Hello wold!");
    }
}
