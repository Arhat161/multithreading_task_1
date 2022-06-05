public class Main {
    public static void main(String[] args) {
        System.out.println("Create threads...");

        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadsGroup1"); // first, create Thread Group and set name

        Thread thread1 = new MyThread(myThreadGroup, "1"); // create thread from 1 to 4 and start it when created
        Thread thread2 = new MyThread(myThreadGroup, "2"); // see constructor in class MyThread for detail
        Thread thread3 = new MyThread(myThreadGroup, "3"); // ....
        Thread thread4 = new MyThread(myThreadGroup, "4"); // ....

        try {
            Thread.sleep(15000); // set delay for main() method thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stop all threads in group '" + myThreadGroup.getName() + "' ..."); // stop message
        myThreadGroup.interrupt(); // stopping all threads in group myThreadGroup
    }
}





