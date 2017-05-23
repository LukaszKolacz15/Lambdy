package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

/**
 * Created by Lukasz Kolacz on 23.05.2017.
 */

public class LambdasHomework {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(8);
        elements.add(12);
        System.out.println(LambdasHomework.map(elements, (a) -> a + 5));
    }

    public static List map(List<Integer> list, IntFunction<Integer> operate){
        List<Integer> newList = new ArrayList<>();
        for(int i : list){
            newList.add(operate.apply(i));
        }
        return newList;
    }
}
