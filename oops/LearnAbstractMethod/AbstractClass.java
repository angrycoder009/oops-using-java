package oops.LearnAbstractMethod;

public class AbstractClass {
    public static void main(String[] args) {
        //abstract class is type of method which is not instanciated because
        //we aren't able to create object
//        Vehicle v1 = new Vehicle();


        //but we can make instance of child class.
//        Car c1 = new Car();
//           c1.accelerate();
//           c1.breaks(4);
    }
    abstract class Vehicle{
       //create abstract method

        abstract  void  accelerate();
        abstract  int  breaks(int wheels);

    }
    //Now we cannot access them right.
    //so we can access by making it by child class

    abstract  class Car extends Vehicle {

          @Override
        void accelerate(){
              System.out.println("Car is accelerating");
          }
          @Override
         int breaks(int wheels){
              System.out.println("Car breaks are pushed");
           return  wheels;
          }


    }


}
