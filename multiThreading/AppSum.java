package multiThreading;

//Sample class to demonstrate how we can perform single task using multiple threads. in this application , we will perform sum on different parts of the array via
//parallel processing using multi thread and then will join all of them to calculate the total sum

//Even though we are waiting to complete the calculation of all the threads still this method is benficial . the overall execution time might not decrease significantly due to waiting for all threads to finish, the perceived responsiveness of the application can improve. By utilizing multiple threads, you can parallelize the work and make better use of available CPU cores, potentially reducing the time it takes to complete the task.
//MultiThreading enables concurrent execution of tasks ./ the overall execution time might not decrease significantly due to waiting for all threads to finish, the perceived responsiveness of the application can improve. By utilizing multiple threads, you can parallelize the work and make better use of available CPU cores, potentially reducing the time it takes to complete the task.

//All threads execute simultaneously and we can not say which thread will first start executing . it depends on JVM Thread scheduler .

public class AppSum {

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 4;
        int chunkSize = array.length / numThreads;

        SumThread[] threads = new SumThread[numThreads];

        for(int i=0;i<numThreads;i++){
            int startIndex = i*chunkSize;
            int endIndex=(i+1)*chunkSize;
            if(i==numThreads-1){
                endIndex = array.length;
            }
            threads[i] = new SumThread(array, startIndex, endIndex);
            threads[i].start();
        }

        int totalsum =0;

        for(int i=0;i<numThreads;i++){
            try{
                threads[i].join();
                totalsum += threads[i].getPartialSum();
            } catch(final InterruptedException ex){
                ex.printStackTrace();
                throw new InterruptedException("interrrupted exception thrown while joining the threads"+ ex.getMessage());
            }
        }
        System.out.println("Total sum is "+ totalsum);

    }
}
