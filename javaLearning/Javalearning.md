<!-- Java -> JVM (Byte code top machine code) 
JRE-> JVM + Library 
JDK -> JRE + JVM + Programming language + Compiler + Debugger

Java code converted to bytre code via JIT compiler -> platform independent 
JDK JRE JVM platform dependent

i) JSE -> Java Standard Edition i.e Core Java ii) JEE -> Java Enterprise Edition i.e Transactional Apis Servlets Building large scale Applicatioons , commit rollback Transactional APIS iii) JME -> Java Mobile Edition

Java code -> compiler -> byte code -> Jvm calls  main method -> need to be public as JVM calls this from outside package

Why static -> static variables / methods are part of class. JVM does not require object of class 

 Why main method is void so the short answer is because it does not return anything but if you want to know in depth about why main method in java returns void but in  C/C++ it returns 0, then this is the reason behind it :- The C and C++ program which return int from main method are processes of operating system . The int value returned from the main in C and C++ is exit code or exit status.  

Exit Code 0 -> means successful termination  
Exit Code non-zero -> indicates an error 

The parent process of any child process keeps waiting for the exit status of the child and after receiving that exit status of child it clears up the child process from the process table and free the resources allocated to it . That is why it becomes mandatory for C and C++ program to pass their exit status . However, the java program runs as a main thread in JVM. The java program is not even a process of operating system directly this is why main method of java is not designed to return an exit status. However, JVM is a process of Operating system and JVM can be terminated with a certain exit status with help of System.exit(int status).

Interpreter vs Compiler vs JIT (Just in time) compiler

javac <Classname.java> -> creates byte code .class file 
Now java <ClassName> -> JVM runs the bytre code and output is printed . JVM reads only byte code.


Why only one public class in single java file->
:: Main method should be inside public class . because JVM will call main method so class need to be public. static because JVM can call the method via className.
Accessible outside package . if there are multiple public classes in single Java file then Jvm will not be anle to understand which main method to invoke. That's why 
Java restricts only one public class in single java file.

Static is part of class. No need to instantiate the class.


/ How float and double number stored in memory

float -> 32 bit IEEE754 format. 1 bit for sign . 8 bit exponent . 23 bit significant/ mentisa 
=> 4.125f
Step 1: convert 4 to binary ->100
.125 -> .125*2 = 0.25 
0.25 * 2 = 0.5   top to bottom -> 0.001
0.5 * 2 = 1.0
4.125f = 100.001

Step2: Make it in form of (1.xxx)*2^x . So it will become 1.00001*2^2

Step 3: Add bias to exponent
.00001 -> mentisa and 2 is exponent . Now 1 bit sign . 8 bit bias . 23 bit mentisa/significant
so here 127+2 = 129 . so exponent is 129

Step4: 0 10000001 0000100000000000  binary representation as per IEEE 754 Format

Now transform to decimal from binary (-1)^signbit * (1 + mentisa/ significant) * (2)^ (e-127)

exponent is 129 . and mentisa need to be calculated by placing 2^--1 / 2^-2  in this manner . count the position of 1's in mentissa starting from 1 and then do 2^-pos

float a =4.125f . (double)a

0.7f ->




float 32 bit double 64 bit

1 bit sign 11 bit exponent 52 bit for mentisa / significant . bias 2^10 -1

for recurring decimal problem in java while retrieving the value , we use BigDecimal instead of double /float . if we store 4.7 , output is 4.7
while dealing with decimal value


<!-- Reference/ NonPriomitive data type -> 1. Class 2.String 3. Interface 4.Array . 
Class: New keyword space is allocated in heap memory
And when we  do Object obj= new Object(). then inside heap memory space is allocated for the object  And obj variable hold sa reference to the actual memory
Objects will be created inside heap meory and the object variable name will hold the reference of actual heap memory.
No concept of pointer &a Pass by refernce . In java everything is pass by valueOnbject variable hold the refernce to the actual memory
Pass by reference can be achieved by reference data type . because object variable holds the refernce to the actual memory stored in heap.


String: is also reference data type . heap memory . String is immutable . string literals. StringConstantpool is present inside heap memory
let us assume we first initialized String s1 = "hello"
Now here s1 will point to the string literal hello which is present inside String constant pool present inside heap memory
if now we do String s2 = "hello" , then string constant pool will check whether heloo literal is already present or not if present then s2 will also point to the same literal .
Now if we do String s3 = new String ("hello"). Now if we do create via new keyword , it will create a separate memory spoace apart from String constant pool inside heap memory.  == checks whether bothe the comparative variables are part of same meory or not . .equals() method checks value inside the memeory
so s1== s2  but s1 != s3
but s.equalsTo(s2) true and s1.equalsTo(s3) that will also be true . because equalsTo method checks the value inside memory

Strings are immutable . if we do s1 = "hello World" . it will check whther string literal helloworld is present inside stringconstantpool or not. if not present then helooworld string literal will be added and s1 will start pointing to helloworld string literal . but the older string literal hello will not be replaced by helloworld.
s1 is holding a reference inside string constant pool if created using literal and if created via new then holds a reference to the new memory space inside heap memory. String literals are present inside string constantpool

Interface is also reference datatype. parent class can store the reference of child objects

Array is sequence of memory location in heap memory which stores same data types int arr[] / int [] arr = new int[5]
int arr[] = {30, 20, 10} 
2d Arr int arr[][] = new int [5][5]

Wrapper class -> 1. Autoboxing 2. Unboxing

8 primitive types : int char short byte long float double boolean . we have wrappers for each primitive types. Wrappers are introduced as refernce class of primitive data types . Reference classes are introduced because . in a method we can pass the object . and if we change the object , it will be changed in memory.
but in case of primitive dataype , if we change the primitive data in any other method value of primitive data wiull not be changed in the caller method 
primitive data stored in stack not in heap memory. Reference datatypes helps us to change the value present in the memory reference.

All the collections Arraylist Hashmap these only work on Reeference datatypes / Objects , not in primitive datatypes.
Primitive to wrapper class is Autoboxing . int x = 0; Integer ix = x;
Wrapper to primitive class transformation is called unboxing  Interger ix =0; int x = ix; Wrapper class variables holds the refernce to actual memory.

Constant variable. Static variable belong to class. static can be conatnt by final keyword

Java Primitive variables: variable is a container which holds a value. Java is static and strong typed language

<!-- 
Methods -> access specifier public private protected default . package is collection of logically similar classes
public : can be accessed through any class of any package . private can be accessed by methods only in sanme class
protected: can be accessed by other classes in same package or by subclasses default: if we do not mention any access specifier then default access specifier is used . 
default access specifier is accessed within same package.

<Access Specifier> <Return Datatype> <method name> <function arguments> <Throws exception List> 

public void printStuff(String...messages)
String...messages is called varargs (variable number of arguments)

System defined methods -> JRE provides these methods already provided in Java
User defined methods -> Overloaded methods -> same methods with different arguments in same class  Overloaded i.e Static binding. Overridden -> dynamic binding 
Overloaded methods should be considered as per number of arguments not return type. Overriden decided on runtime  i.e dynamic binding

Static method is associated with class. static methods can not access non static instance variables
public class Calculator {
    
    public static void main(String[] args) {

        / print () will throw error as static method can not access non static methods / instance variables
        Calculator calculator = new Calculator();
        System.out.println(calculator.print());
    }

    public int print() {
        return 10;
    }
}

<!-- static method can not be overriden . Overriding is dynamic binding . because in override , what instance the object holds (whether parent instance or child instance)
the method got invoked at runtime . so static can not be overriden as static is compiletime
Methods which do not modify state of object can be declared static . if any instance variable or anything object state changes then not static
Factory design pattern impl of static 

Final method can not be overriden by subclasses. Abstarct method can be used in abstract class only method declaration is done. method definition / implemnettaion is part of child class
varargs -> how many parameters in methods. public int sum (int ...bvar)
for (int i: bvar)

only one variable argument in the method and it should be the last argument of then method

Constructor used to create instance. name should be same as class name. Who is helping to create the object -> new or constructor
new keyword tells java at runtime call constructor. constyructor does not have return type to avoid the ambiguity with methods

why constructor can not be final -> constructor can not be overriden . so no use of final keyword. child class do not have access to constructors so can not be abstract

constructor can not be static . constructor is used to initialize varilables . if constructor is defined as static . static method can only access static variables not instance variable . if constructor is static then we can not initialize instance variables. constructor is used to create instance

Constructor type: -> 1. default 2. No arg 3. Parameterized 4.Constructor overload 5. Private constructor
Constructor can not be overridden because it can not be inherited becaused if inheritance allowed then naming problem will occur.
whenever we define any constructor manually , then no default constructor will be added. this refers to the instance variable

Private constructor -> only the class allowed to call constructor. other classes can not create object by directly calling constructor . used in singleton 
Need to create separate static method which will invoke the private constructor

Constructor chaining -> this & super
in case of inheritance , initializing parametrized constructors need super .chaining via super.
 -->

 --------------------------------- Memory Management and Garbage Collection ----------------------------------------------------------------------------
<!-- Java memory (RAM) management 
Stack & heap . JVM  manages the memory. Stack & heap created by Jvm and stored in memory / RAM .

Stack memory: temporary variables are stored in stack . seperate memory block for methods. primitive data types store primitive data types 
whenever we create any object with the new keyword stored in heap memory. reference of object stored in stack-> strong reference weak reference soft reference
Each thread has its own stack memory . but all the threads share common heap memory
variables within scope is only visible and as soon as variable goes out of the scope, it gets deleted from stack in LIFO order
when stack memory goes full it throws stackoverflow error
for each method a block of memory allocated in stack and all the variables created in the scope. primitive variable in stack
if we create object via new keyword e.g Person personobj = new Person() . here person object will be created inside heap memory . Reference of the person obj will be stored in personobj variable which will be stored in stack memory. personobj will hold the reference of the object

string literal is stored inside string constant pool inside heap memory . Also a literal variable will hold the reference of string literal which will be stored inside stackmemory . reference variable hold the reference of object stored in heap memory.
we have also deleted the refernces while block scope past .
JVM controls when to run garbage collector system.gc() .Garbage collector runs periodically and delets unreferenced objects from heap . Automatic mmemory management

heap stores the object & stack stores the reference of object.
Person p = new Person() -> Strong reference
Weakreference<Person> weakp = new Weakreference<Person>(new Person())
weakrefernce is whenever garbage collector will run , memory will be freed up even if there is reference
In case of strong refernce memory will be freed up only if there is no reference.
Softreference -> garabage collector allowed to remove this reference iff the space is very urgent to be freed up .

Heap memory -> 1. Young generation 2., old generation 
Young generation ->1. Edem 2. S0 3. S1. Whenever new object created it goes into edem .Let us assume after sometime garbage collector invoked ->
Mark and swwp algo . Mark algo it first marks the objects in heap memory space which are not referenced. Sweep algo removes the old objects and the remaining objects are called surivivors and pushed to S0 & S1 memory space nad age of these objects also increase . this is called minor GC.
Non heap metaspace .Mark algos identifies the unreferenced objects from edem s0 s1

if any object surivives till threshold age these objects are promoted to old generation . here garbage collection process is major Gc
 Non Heap metaspace -> every object created through static class variable/ class metadata/ constants are stored into metspace.
 As soon as JVM need to load any class , JVM will load the class in non heap metaspace and as soon as not needed it will be removed 
 Permgen till java 7 . From Java8 onwards it is Non heap metaspace.
 Permgem is part of heap . metaspace is out of heap and it is also expandable as required

 Garbage collector -> Mark & Sweep With Compact Memory . In this also , After Sweep step, memory compact . 

 GC Version: 1. Serial gC (Only one gc thread will be working . As single gc thread , the process is slow .Also the process is expensive . As when gc thread starts working , all the application thread stops working. if gc slow, then overall application becomes slow) 2. Parallel gc (default garbage collector in Java 8. depending upon the core e.g 4 core there will be 4 threads parallely ) 3.Concurrent Mark & Sweep (application threads are working , concurrently gc threads are working . But JVM does not guarantee that application threads will not stop . but No memory compaction will happen in this case) 4.G1 Garbage collector (Better versions ofConcurrent  mark and sweep . Along with concurrent mark and sweep it also ensures that memory gets compacted and all the freed up memory added at last)in the latest version of Gc , pause time of application thread reduced. throughput increases , latency decreases
-->

----------------------------------------------------Java Classes--------------------------------------------------

<!-- Concrete classes ->we can create instances using new keyword

Object classes is parent of all the classes it contains some common methods i.e toStrings notify clone Abstract class

Nessted class ->static nested class / non static nested class (inner class).
inner class is furthervdivided into two parts . local inner class member inner class Anonymous inner class

static classes can be created with private and protected access modifier

member inner class with public private protected access modifier and non static inner class 
if we are creating inner classes within a block like for loop while loop if condition block. it can not be declared as private protected . only default access modifier
it can not be initiated outside the block 

inheritance in nested class is possible non static nested classes can be inherited by inside the outer class

Also static nested classes can be inherited by classes outside of outer class by simply extendes OuterClass.innerClass
But non static nested classes can also be accessed by classes outside of outer classes via constructoe . new OuterClass().super()

Anonymous class -> inner class without a name is called anonymous class. When we want to override without creating any subclass
AbstractCalculator calc = new AbstractCalculator() {
            @Override
            public void display(){
                System.out.println("Sum of A and B");
            }
        };

        internally compiler provides a name
        When we want to override without creating any specific subclass.
}

parent object can hold the reference of the child object 


Pojo (Plain old java object) Enum  Final class .

Enum constants are static and final by default implicitly . No need to mention explicitly . Enum can not extend any class as it internally extends java.lang.enum class. it can implement interfaces. public Enum <EnumName>

Enum can have variables , constructor, methods
it can not be instantiated as constructor is private automatically created even if default is provided
No other class extend enum class bacause Enum alreadst extends java.lang.enum
it can have abstract method and all the constant need to implement the abstract method
if we do not give any value to enum constants , internally value is assigned starting from zero and then increementing it to 1, 2 and so on.
values() -> fetch all the constants . orddinal()-> default values assigned with constants starting from zero. value of() ->string is matched with the object  name()

Any method we need to define in enum need to define as static .Becxause Enum can not be instantiated so to the access the method use static

static members can not be overridden/ abstract . because static members are compile time but overriding is related to Runtime elements.
But an abstract class can have static member functions and variables . If any subclass implements the method with same signature , then it is method hiding i.e Subclass has its own version of static method and super class has its own version of the static method
A parent class constructor is not inherited in child class that's why super is automatically added in child constructor
constructor can not be overriden . so it can not be static final or abstract. 

singleton class -> create one and only one object of somre class like DB Connection and then use insert query
1.Eager initialization (initialization in advance)
2.Lazy initialization 3.Synchronization block 4.Double check lock (there is a memory issue , resolved through volatile instance variable) 
5.Bill pugh solution  6.Enum singleton
As soon as application started, all the static variables pre loded into memory. even though someone is not using it still it is stored into memory
core -> cache -> memory
omly one enum instance per jvm possible

Reference variable contains the object of which class .this is determined in runtime. interface can holds the refernce of the classes which implements it. dynamically we are calling different object fly method . So it helkps to achieve polymorphism. Interface can be used as data type

Multipleminheritance is possible only via interface

insidevinterface all methods are implicitly public . methods canb not be dclared final 

fields are publiuc static final by default as static final is used to define constants
overriding method can not restrict the access specifier
Nested interface can be declared within class  or within another interface

Inner interface inside an interface can only be public . but inner interface inside a class can be protected or private.

in java 8 / java9 method implementaion is also possible in interface

// java 8 interface features ->
-> Default method static method functional interface and lambda expression
// default int getHeight() {
//return 100;
//}

// Java 9 additional features
Private method & private static method


// //Compiler vs interpreter
Compiler first Creates an executable file from the high level language and then execution is very first. Interpreter translayes line by line . so translation is fast and also executable file not generated .so execution is slow . Also conversion from high level to machine code is fast in interpreter in line by line. In interpreter errors are displayed fopr each single instruction.

// metadata in java code -> annotation . during runtime using reflection, we can access
// // Read metadata information using Reflection .i.e cl;ass filed parameter method.
// annotations are metadata only . optional . use the information at runtime to add certain logic . access metadata via reflection

// Predefined annotations -> @Deprecated @Override @Functional interface. @FunctionalInterface @SafeVarargs



-->