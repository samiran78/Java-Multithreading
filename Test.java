public class Test {
    public static void main(String[] args) {
        System.out.println("hii");
        //now lets see what threadd is working
        System.out.println(Thread.currentThread().getName());
        World world = new World();
        world.start(); //way 1 by extending Thread class
        world2 world2 = new world2(); //way 2-> by implementing Runnable interface.
        Thread t1 = new Thread(world2);
        t1.start();
        for(; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
