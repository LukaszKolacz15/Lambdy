package pl.akademiakodu;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Lukasz Kolacz on 22.05.2017.
 */
public class Zadanie3 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tomek", "Lukasz", "Kuba", "Pawel", "Hubert");



//        Collections.sort(names, new Comparator<String>(){
//            @Override
//                    public int compare(String o1, String o2){
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

//        LAMBDA TEGO CO ZAKOMENTOWANE WYZEJ (Collections.sort(names, new Comparator<String>(){ ...):
        Collections.sort(names, (arg1, arg2) -> arg1.compareToIgnoreCase(arg2));

//        for (String name : names) {
//            System.out.println(name);
//        }


//      FOR EACH OD JAVY 1.8 ( names.forEach(Consumer<? super String> action) void ):
        names.forEach(arg1 -> System.out.println(arg1));


        
    }
}
