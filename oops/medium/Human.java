package oops.medium;

public class Human{
    int age;
    String name;
    int salary;
    boolean married;
  public static long  population ;
    public Human(int age , String name , int salary , boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }

}
