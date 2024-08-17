package oops.MultithreadingJava;

public class ThreadingInterfaceRunnable {
    public static void main(String[] args) {
        MythreadRunnable1 thread1 = new MythreadRunnable1();
        MythreadRunnable2 thread2 = new MythreadRunnable2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

    }
    static class MythreadRunnable1 implements Runnable{
        public  void run(){
            System.out.println("I am a thread1 not threat");
        }
    }
    static class MythreadRunnable2 implements Runnable{
        public  void run(){
            System.out.println("I am a thread2 not threat");
        }
    }
}
