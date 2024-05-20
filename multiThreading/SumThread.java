package multiThreading;

public class SumThread extends Thread{

    int startIndex;
    int endIndex;
    int partialSum;
    int[] array;

    public SumThread(int[] array, int startIndex, int endIndex){
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        partialSum =0;
        for(int i=startIndex; i<endIndex;i++){
            partialSum+=array[i];
        }
    }

    public int getPartialSum(){
        return partialSum;
    }
}
