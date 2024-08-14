package oops.JavaFeatures;
@FunctionalInterface
interface myFunctionalInterface{
    int operations(int a , int b );

}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        myFunctionalInterface myFunc1 = (a,b) -> b + a;
        myFunctionalInterface myFunc2 = (a,b) -> a-b;
        myFunctionalInterface myFunc3 = (a,b) -> a*b;
        myFunctionalInterface myFunc4 = (a,b) -> a/b;
        int res1 = myFunc1.operations(2,4);
        int res2 = myFunc2.operations(2,4);
        int res3 = myFunc3.operations(2,4);
        int res4 = myFunc4.operations(2,4);

        System.out.println("The sum is:"  +res1);
        System.out.println("The minus is:"  +res2);
        System.out.println("The multiply  is:"  +res3);
        System.out.println("The  divide is:"  +res4);

    }
}
