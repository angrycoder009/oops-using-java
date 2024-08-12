package oops.staticMethod;

//import static oops.medium.Message.message;

import oops.medium.Human;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world!!!!");
//        message();


        Human gopal = new Human(21,"Gopal Yadav",10,false);
        Human rahul = new Human(24,"rahul",50,true);
        Human arpit = new Human(24,"rahul",50,true);
        System.out.println(Human.population);
//        greeting();
    }

     static  void fund(){
//        greeting();
     }
    //we know that something  which is not static , belongs to an object
    void greeting(){
        fund();
       System.out.println("hello world");
   }
}
