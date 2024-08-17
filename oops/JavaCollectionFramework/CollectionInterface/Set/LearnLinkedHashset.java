package oops.JavaCollectionFramework.CollectionInterface.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashset {
    public static void main(String[] args) {
        Set<Integer> set= new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);  //same elemet will egnore
        set.add(40);
       //here order will maintained
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
