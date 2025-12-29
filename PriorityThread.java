public class PriorityThread extends  Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"-priority:"+Thread.currentThread().getPriority()+"-Count"+i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
PriorityThread p1 = new PriorityThread();
//start the p1 theread;
        p1.start();
    }
}
