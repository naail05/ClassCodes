package day39_Collections.multiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWorld(1);
        Thread thread2 = new ThreadHelloWorld(2);
        Thread thread3 = new ThreadHelloWorld(3);
        Thread thread4 = new ThreadHelloWorld(4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();//if we want the threads to be executed at the same time concurrently then we need to use the start method



    }


}
