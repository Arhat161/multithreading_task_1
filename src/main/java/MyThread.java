// create class MyThread as extends of class Thread
class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name); // use super class constructor
        this.start(); // start all threads in group
    }

    // Override run() method from Thread class
    @Override
    public void run() {
        try {
            while (!isInterrupted()) { // if thread is no interrupted
                Thread.sleep(2500); // delay
                System.out.println("Hello, my name is '" + this.getName() + "' !"); // show message with thread name
            }
        } catch (InterruptedException err) {
            System.out.println(err.getMessage()); // error message
        } finally {
            System.out.printf("Thread %s completed.\n", getName()); // message when thread stopped (interrupted)
        }
    }
}