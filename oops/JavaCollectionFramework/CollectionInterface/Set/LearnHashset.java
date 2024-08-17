package oops.JavaCollectionFramework.CollectionInterface.Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashset {
    public static void main(String[] args) {
        //dublicate not allowed
        Set<Integer> set= new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);  //same elemet will egnore
        set.add(40);
         //order is not defined  because of hashing that convert into hash must be unique
        System.out.println("set element :" + set);


        //remove the element
        set.remove(40);
        System.out.println(set);

        //contains
        System.out.println(set.contains(100));


        //isEmpty
        System.out.println(set.isEmpty());

        //size
        System.out.println(set.size());

        //clear
        set.clear();
        System.out.println(set);





    }
}
