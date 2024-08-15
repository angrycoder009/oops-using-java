package oops.JavaCollectionFramework.CollectionInterface.List;
import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        //add element
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Tiger");

        System.out.println("Stack :"+animals);
        //finding topmost element
        System.out.println(animals.peek());

        animals.pop();
        System.out.println("STACK :"+ animals);
        System.out.println(animals.peek());


    }
}
