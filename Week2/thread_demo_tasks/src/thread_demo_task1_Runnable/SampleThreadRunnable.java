package thread_demo_task1_Runnable;

public class SampleThreadRunnable implements Runnable{
	
	public static int myCount = 0;
    public SampleThreadRunnable(){
         
    }
    public void run() {
        while(SampleThreadRunnable.myCount <= 10){
            try{
                System.out.println("Sample Runnable Thread: "+(++SampleThreadRunnable.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception : "+e.getMessage());
            }
        }
    } 
}
