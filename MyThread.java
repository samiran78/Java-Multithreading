public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("running state");
        //t1 sleeps
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
  MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        //state is ENUM
       Thread.sleep(200); //sleep for 200 ms
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
//        note:->join() makes the current thread wait until the target
//        thread finishes, using wait() internally, and it is interruptible.


    }
}
