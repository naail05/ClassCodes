package day39_Collections.multiThreading;

public class ThreadHelloWorld extends Thread {


    int threadNumber;
    public ThreadHelloWorld(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i+" Hello world Thread: "+threadNumber);// we want hello world to be printed five times for every thread
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
