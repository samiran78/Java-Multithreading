public class world2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1200000;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
