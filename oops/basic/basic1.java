package oops.basic;

public class basic1 {
    public static void main(String[] args) {
        //teacher asked you to create ds to store the data of 5 students
      //store  5 roll nos
        int []  num  = new int [5];

      //store  5 names
      String []  names = new String[5];

      //data of 5 students : {roll no , name , marks}
        ///here every 5 element is integer.
        int [] rno = new int[5];
        ///here every 5 element is string.
        String []  name = new String[5];
        ///here every 5 element is float.
        float [] marks = new float [5];
        ///here every 5 element is integer.

        ///But hum chahte hain ki daata strucutre jo har ek student ka data specifically store kare

        //nnow iss problem karne ke liye
        // use karte hai class concept
        //ageain??

        ///what is class ???
        ///a class is named group of properties and function .
        //agar hum ko combine karna hain {roll no , name , marks} toh hum kar sakte hain by class concept.
        ///Class start with capital letter.
        //another difination , if you want to create your own data type using by classes.

      //declaring
        student gopal;

        gopal = new student();
//        System.out.println(gopal.rno);  // 0
//        System.out.println(gopal.name); // null
//        System.out.println(gopal.marks); //0.0

        System.out.println(gopal.name + " ," + gopal.marks + " ," + gopal.rno);


        //how to manipulate object?
//        gopal.rno = 13;
//        gopal.name = "gopal yadav";
//        gopal.marks = 56f;
//        System.out.println(gopal.rno);  // 0
//        System.out.println(gopal.name); // null
//        System.out.println(gopal.marks); //0.0


    }


    ///create a class

    /// a class is a template of object.
    // an object is an instance of class.


    //properties of object - 1.state of object(means its value from its datatypes.)
    // 2. Identities of object(means whether one object different from another.) 3. Behaviour of object
    ///objects are stored in heap memory and reference variable are stored in stack memory.


    ///what is instance variable? variable inside the object aka instance variables.
    // dot (.) operator links reference variable of object to instances variable .


    ///new ->> it dynamically allocate the memory at runtime.
    ///return the reference to it.
    // the reference is going to stored your create reference variables.



    /// for every single students
    static class student{
        ///here every element is integer.
        int rno ;
        ///here every  element is string.
        String  name ;
        ///here every  element is float.
        float  marks;


        ///what is constructor??
        ///constructor is  a special function that is inside the class either it's created or default
        // that runs when you create an object and it allocates sum variables as you like it.



        //calling one constructor one to another
        student(){
            this(56,"gopal",77);
        }






        ///so we need a way to add the values of object  by object. -- using this keyword
        student(int rno ,String name , float marks ){
            this.rno = rno;
            this.name =  name;
            this.marks = marks;
        }




    }
}
