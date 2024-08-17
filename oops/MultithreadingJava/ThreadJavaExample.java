package oops.MultithreadingJava;

public class ThreadJavaExample {
    public static void main(String[] args) {
//       MyThread t1 = new MyThread();
//       MyThread2 t2 = new MyThread2();
//       t1.start();
//       t2.start();
    }
    class MyThread extends  Thread{
        @Override
        public void run(){
            while(true)
            System.out.println("Thread1 is running");
        }
    }
    class MyThread2 extends  Thread{
        @Override
        public void run(){
            while(true)
                System.out.println("Thread2 is running");
        }
    }
}
