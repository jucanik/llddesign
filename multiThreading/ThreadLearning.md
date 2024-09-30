# Sample class to demonstrate how we can perform single task using multiple threads. in this application , we will perform sum on different parts of the array via
# parallel processing using multi thread and then will join all of them to calculate the total sum

# Even though we are waiting to complete the calculation of all the threads still this method is benficial . the overall execution time might not decrease significantly due to waiting for all threads to finish, the perceived responsiveness of the application can improve. By utilizing multiple threads, you can parallelize the work and make better use of available CPU cores, potentially reducing the time it takes to complete the task.
# MultiThreading enables concurrent execution of tasks ./ the overall execution time might not decrease significantly due to waiting for all threads to finish, the perceived responsiveness of the application can improve. By utilizing multiple threads, you can parallelize the work and make better use of available CPU cores, potentially reducing the time it takes to complete the task.

# All threads execute simultaneously and we can not say which thread will first start executing . it depends on JVM Thread scheduler .

## Public static native void sleep(long milisecond)  public static void sleep(long mili, int nano)-> These two are static method i.e we can directly call these two methods from Thread class i.e No need to create object opr specific instance of the Class . Sleep method throws Interrupted exception. 1. When any thread is sleeping or in sleep mode and another thread interrupts it , then interrupted exception is thrown . Sleep method always pauses current thread exceution.when the JVM finds the sleep() method , JVM checks which thread is running and pause the exceution of that thread.
## When we use Sleep() method to pause any thread exceution , the thread scheduler assigns the CPU to another Thread if another thread exists . So there is no guarantee that Thread will wake up immediately after the time specified in Sleep method. It totally depends on Thread Scheduler. While thread is sleeping it does not lose any lock / monitors that it had accquired before .  Sleep method overloaded two times. sleep() method throws interrupted exception. sleep() is only static method .

## yield() method stops the current execution thread and provides chance to other threads for execution of same or higher priority thread to ewxecute . Method prototype -> public static native void yield(); yield() method not overloaded. yield() methoid does not throw interrupted exception. yield() is static method.

## join() -> public final void join() , public final synchronized void join(lonhg mili), public final synchronized void join(long mili, int nano) if a thread wants to wait for another thread to complete its task, then we need to add join() method. join() method overloaded. join() method throws interrupted exception. join is only final method .  join() is not static method neither native method.

## Thread Interrupt in java -> used to interrupt an exceuting thread .interrupt method will only work if the thread is in sleeping or waiting stage. if a threadvis not in sleeping or waiting stage then calling interrupted method will perform normal behaviour. when we use interrupted method it throws InterruptedException . Method prototype -> public void interrupt()

## interrupted() and isInterrupted() method is used to check whether a thread is interrupted or not . 
## interrupted() method clears the interrupted status from true to false , if thread is interrupted(). public sttaic boolean interrupted() public boolean isInterrupted()

## Synchronization is the process by which we control the accessbility of multiple threads to a shared resource. Thread interference and Data Inconsistency .

## Thread and Process : Process is instance of a program that is getting executed. It has its own resources like memory, thread etc. Os allocates these resources when it is getting created

Always start from mandatory and then make it optional to make the system more scalable javac test.java -> generates byte code that can be executed by Jvm (Compilation). Then  java Test . This is called Exceution. At thia point, JVM start the new process .And Process is instance of program that is getting exceuted . 
Process is instance of programn that is getting executed .It has its own resources like memory thread. OS allocates these resources to process when it is created 
Process has its own memory heap memory and independent of each other . Thread is smallest sequence of instructions which is parallaly computed by CPU .Process starts with main thread. Main thread we can initiate more threads . When does process gets created ? it takes care of exceution of this program .
creates process -> JVM instance created . Process has multi threads .Register stack and counter local to neach thread and not shared between threads . Core data segment heap memory shared between all the . Core segment . when we run Java main -> 1. firsy process is started 2. JVM instance allocated including all the memories 3. JVM starts JIT Compiler to transform Java byrte code to machine code . further CPU executes this machine code. Code segment stores the compiled byte code (i.e machine code) shared acreoss threads 
data segment stores global and static variables . synchronization is required as threads can share data . code segment is read only so no synchronization required.
Heap where new objects are stored allocated . and threads share the heap memory but didferent process has different heaps
Each threadhas its own stack . . Each thread has its own stack .It manages methodf calls and local variables
Register is used to optimize machine code
Counter is basically pointing to the machine code(which is in core segment) which need to be exceuted. points to the instruction which is in exceution. All these are managed by JVM
PC of a thread has the addres of the machine code where that particular thread need to start executing
Register is like memory .whenever OS scheduls a thread and it starts working , machine code pointeed by program counter loaded into thread local register and thenmnoved to CPU register and processed that thread result till OS scheduls another thread . Now let us assumes OS has scheduled another thread . so at that point CPU result present in CPU register will be stored into the earlier thread local registerThis is called Context switching .whenever this thread will start again, thread local register data will be loaded into CPU register.in multicore CPUs , two threads can run actually parallaly. program counts points to the address in the code segment where eifjcbgbkictvjkflhgjbthcunncnlrvkiftrkllcsfkgnnv
 thread need to run . Context switching -> when next thread need to be schedued , OS wiol.l put all the intermediared data from CPU regster to earlier thread local register .This is called context switching
 Multithreading: Allows a program to perform multiple threads at the same time. Multiple threads share the same resources but still they can perform task independently
 1. task poarallelism 2. responsiveness 3. resource sharing
 different processes at same time -> multitasking . but didfferent threads at same time -> multithreading. Multitasking do not share any resource . but multithreads share resources like heap memory , code segment data segment. context switching means they are running in one cpu only . but os scheduler schedules which thread to run . so seems parallel . in myulticire cpu , it is actually parallel.
 // THread.start()-> runnable state . now it will be waiting for CPU and when it will get CPU , it will go to the running state
 // context switching -> runnable to running .execution finished -> terminated
 // whenever thread is performing some io tasks / thread is waiting for the io task (basically network call e.g getting data from DB) thread will be blocked or any other thread locked that particular resource . Also we can block thread by putting thye thread in wait state.
 // Thread can be blocked or waiting or timed waiting. in blocked state it gewts blockedcby io calls or when resources get locked by some other thraeds. In waiting state, we put the thread in wait state by calling wait method . this thread will again come back to runnable stat when we will call notify() method. in timed waiting method thread will stop for some time and after that thread will be in runnable state
 // start -> runnable -> wait / block/ stop ->
 // Thread lifecycle -> new -> Thread has been created but not started .it is just an object in memory. after that thread lifecycle will get statrted when start thread will be calkled-> runnable-> ready to run -> waiting for cpu time -> running -> got cpu time / thread starts executing code-> blocked -> runnable thread goes inmto block state when io operation or any network call or resources gets blocked.
// daemon -> something which is running async -> user and daemon thread. setDaemon(true) else user thread without setDaemon. daemon thrtead is only alive till any user thread is alive.JVM has daemon thread for Garbage collection. when program is running , Garbage collector is freeing up the memory in the background . Similarly for autosave daemon thread.
Logging is also one type of demon thread


// locks and semaphores-> synchronized block -> monitor lock
// public synchronized void producer -> synchronized will put monitor lock on the object
// custom lock->
reentrant lock does not depend on object . ebven two threadfs are alloted different object, still only one thread will go into critical section
shared lock (read) exclusive lock (write). if any thread can put share lock , then no other thread can put exclusive lock
in readwritelock , if two threads call a method with same lock object, two simultaneous threads with read lock will be allowed . but two simultaneous tyhreads with write locks will not be allowed
//stamped lock -> read write lock + optimistic read
// seemaphore lock