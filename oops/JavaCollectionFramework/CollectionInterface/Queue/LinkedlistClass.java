package oops.JavaCollectionFramework.CollectionInterface.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistClass {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        //adding element from rear end
        queue.offer(12);
        queue.offer(24);
        queue.offer(33);

        System.out.println("Queue:"+queue);

        //removong elelemnt from front end
        System.out.println(queue.poll());
        System.out.println("Queue"+queue);


        //searching next element to be poped
        System.out.println(queue.peek());

    }
}
