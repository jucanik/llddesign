package multiThreading;

// Thread class methods -> 
// basic methods -> run() start() currentThread() isLive(). current Thread is static method . Also currentThread and isLive are native methods and their implementation is done in separate language . CurrenTthread is static method which provides current Thread reference
// Thread Naming methods -> getName() setName()
// Daemon Thread Methods -> setDaemon(boolean b) isDaemon()
// Priority based methods -> getPriority() sertPriority(int)
// Thread Execution Prevent methods -> stop() yield() join()
// Interrupting Thread methods -> interrupt() isInterrupted() Interrupt()
// Inter Thread Communication -> wait notify notifyAll -> thesec are not present in Thread class instead they are in Object Class
// Thread Constructors -> basic Constructors() -> Thread() Thread(String name) Thread(Runnable target) Thread (Runnable target, String name) . ThreadGroup Constructors->
// Thraed(ThreadGroup, ruunnable) Thread(ThreadGroup, Runnable, String)

public class App {

    public static void main(String[] args) {

        MTSample mtSample = new MTSample();
        mtSample.start();
        MTSampleRunnable mtSampleRunnable = new MTSampleRunnable();
        Thread thread = new Thread(mtSampleRunnable);
        thread.start();
    }

}
