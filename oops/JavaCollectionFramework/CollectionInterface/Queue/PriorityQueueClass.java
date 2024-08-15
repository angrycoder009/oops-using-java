package oops.JavaCollectionFramework.CollectionInterface.Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    public static void main(String[] args) { //change into max heap default minheap
        Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());

        //adding element from rear end
        
        queue.offer(42);
        queue.offer(24);
        queue.offer(10);
        queue.offer(23) ;

        System.out.println("Queue:"+queue);

        //removong elelemnt from front end
        System.out.println(queue.poll());
        System.out.println("Queue"+queue);


        //searching next element to be poped
        System.out.println(queue.peek());

    }
}
