package javaLearning;

public class Singleton {

    // Eager Initialization -> Initialization of Singleton object in advance


    public Singleton(){};





   static class SingletonEagerInitialization {
    private static SingletonEagerInitialization singleton = new SingletonEagerInitialization();

    public SingletonEagerInitialization() {}

    public static SingletonEagerInitialization getSingletonInstance() {
        return singleton;
    }
   }
   // as soon as we start the application all the static variables are preloaded. so singleton object will be created when the application statrts and preloaded into the memory even before the object invoke
    // even though we are not using getSingletonInstance method still it will be loaded into memory 

    // nested class are of two ty[es -> static nested class and inner class . now inner classes can not have static memebr functions and vatriables . having srtatic methods allowed from Java 16

    static class SingletonLazyInitialization {
        private static SingletonLazyInitialization singleton;
    
        public SingletonLazyInitialization() {}
    
        public static SingletonLazyInitialization getSingletonInstance() {
            if(singleton==null){
                singleton = new SingletonLazyInitialization();
            }
            return singleton;
        }
    }
// if two threads come in parallel , then both of them will find singleton object null and two singleton object will be created. synchronized method -> lock and unlock .if two threads are calling the getInstabnce method, 
//only one thread  will be allowed at a time . multiple threads will not be allowe at once to call the synchronized method

    static class SingletonSynchronizedLazyInitialization {
        private static SingletonSynchronizedLazyInitialization singleton;
    
        public SingletonSynchronizedLazyInitialization() {}
    
        synchronized public static SingletonSynchronizedLazyInitialization getSingletonInstance() {
            if(singleton==null){
                singleton = new SingletonSynchronizedLazyInitialization();
            }
            return singleton;
        }
    }

    // synchronized at method level . if in multiple places this nis getting invoked , process becomkes slower . as even though object created still synchronized put lock and unclock which will make the procxess slower

    // double check locking system

    static class SingletonSynchronizedDoubleLockingLazyInitialization {
        private static volatile SingletonSynchronizedDoubleLockingLazyInitialization singleton;
    
        public SingletonSynchronizedDoubleLockingLazyInitialization() {}
    
        public static SingletonSynchronizedDoubleLockingLazyInitialization getSingletonInstance() {
            // only first time , singleton will be null .so synchronized block will be executed once .
            if(singleton==null){
                // in case of multi threads for first time, one thread will acquire a lock
                synchronized (SingletonSynchronizedDoubleLockingLazyInitialization.class) {
                    if(singleton == null){
                        singleton = new SingletonSynchronizedDoubleLockingLazyInitialization();
                    }
                }
                
            }
            return singleton;
        }
    }

    /*
    memory issue : in case of multicore cpu, if thread 1 is from first core and if thread 2 is from different core, then there will be difdefrent cache s as well for different cores . And all the difefrent caches ultimately sync the data into memory periodiocalkly
    now let us assume thread1 creates the singleton object in l1 cache but not yet updated into memory neither present into L2 cache . now thread 2 will still find that singleton object is null as it checks on l2 cache and memory.
    Volatile keyword -> in case of any Volatile object read and write will happen from the memory
    As we are using Volatile , we are not using cache , we are using memeory . So it is also slow
    */

    static class SingletonBillPoughInitialization {
    
        public SingletonBillPoughInitialization() {}

        private static class SingletonBillPoughInitializationHelper{
            private static final SingletonBillPoughInitialization singleton_object = new SingletonBillPoughInitialization();
        }
    
        public static SingletonBillPoughInitialization getSingletonInstance() {
            return SingletonBillPoughInitializationHelper.singleton_object;    
        }
    }

//     // nested static class loaded at the time of invoking. Java ClassLoader handles the loading and initialization of classes.
//     // Singleton helper is static nested class . it is not loaded until it is refernced.When SingletonHelper.INSTANCE is accessed for the first time, 
//     //the SingletonHelper class is loaded and initialized by the Java ClassLoader
//     // The Java ClassLoader ensures that the class initialization phase is synchronized, meaning that if two threads attempt to initialize the SingletonHelper class simultaneously, one will wait until the other finishes the initialization.

// //static nested classes are loaded into memory only when they are referred -> it is property of classloader.
// //static nested class does not get loaded when the application starts up immediately.
// //java classloader ensures that class loadiung/ initialization phase is synchronized. if two threads simultaneously invoke
// //Singleton helper class , java classloader ensures that one will wait until the other thread completes the initialization.
// //Java classloader is part of JRE and responsible for dynamically loading classes into JVM when they are needed. Classes are loaded
// //into JVM's memory area known as the method area. This includes bytecode for class's methods and static fields

    // in enum -> in JVM , per enum , only one object is present .Enum constructor is also private\
    static enum SinglrtonEnum {
        INSTANCE
    }


    // //Immutable class -> all class member private and final ()after assignment can not be changed to avoid direct access/just getter methods and return copy of member variable
    // //in case of list List<int> list = new ArrayList<>(); list points to the memory reference of Arraylist.
    // //block of memories and stores the ints inside those memories.

    // //Wrapper class -> Reference or nonPrimitive data types

    // // An interface can extend from only comma separated list of interfaces.

    // // protected and private access modifier not allowed in interface


}