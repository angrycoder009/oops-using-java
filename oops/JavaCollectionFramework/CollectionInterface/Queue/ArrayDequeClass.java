package oops.JavaCollectionFramework.CollectionInterface.Queue;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
       adq.offer(23);
       adq.offerFirst(12);  //add first element
       adq.offerLast(45);   //add last element
        System.out.println(adq);


        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());

        System.out.println(adq.peekLast());

        System.out.println(adq.poll());

        System.out.println("adq:"+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollast()"+adq);




    }
}
