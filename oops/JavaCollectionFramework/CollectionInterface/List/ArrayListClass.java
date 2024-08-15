package oops.JavaCollectionFramework.CollectionInterface.List;
import  java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        //normal like array but array drawback cannot change dynamic size change.


        ///arraylist classes but usees array class but change daynimacally.

        ArrayList<String>students = new ArrayList<>(); //create empty array
        students.add("Rakesh"); //create with other 10 empty element array


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

      ///add element by index
        list.add(1,50);
        System.out.println(list);

       ///Add list one to another .
        List<Integer> newList=new ArrayList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println(list);


        //get the elemnt
        System.out.println(list.get(1));



        ///remove the element in Arraylist
        list.remove(1);
        System.out.println(list);
      //remove directly element
        list.remove(Integer.valueOf(150));

        //remove entire element
//        list.clear();
//        System.out.println(list);


        //set value with modify
        list.set(2,60);
        System.out.println(list);

        //checking value contain or not
        System.out.println(list.contains(50));


        // how to iterate
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("the element is:"+list.get(i));
        }

        //iterator by forEach ;;pp[
        for(Integer element : list){
            System.out.println(element);
        }


        //Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iteractor:"+it.next());
        }
    }
}
