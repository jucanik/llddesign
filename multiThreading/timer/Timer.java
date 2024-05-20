package multiThreading.timer;

public class Timer extends Thread{

    int durationSeconds;

    public Timer(int durationSeconds){
        this.durationSeconds = durationSeconds;
    }

    @Override
    public void run() {
        for(int i=durationSeconds; i>=0;i--){
            System.out.println("Time remaining in "+ i +" seconds");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

}
