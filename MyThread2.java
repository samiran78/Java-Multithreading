public class MyThread2 extends Thread{
    @Override
    public void run() {
       for(int i=0;i<=5;i++){
           try {
               Thread.sleep(4000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(i);
       }
    }

    public static void main(String[] args) throws InterruptedException {
    MyThread2 myThread2 = new MyThread2();
    myThread2.start();
    myThread2.join(); //main -thread wait until  myThread2 ends.
        System.out.println("completed  myThread2");
    }
}
