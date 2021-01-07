package thread_demo_task1;

public class SampleThread extends Thread{

	public static int myCount = 0;
    @Override
	public void run(){
        while(SampleThread.myCount <= 10){
            try{
                System.out.println("Sample Thread: "+(++SampleThread.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception : "+e.getMessage());
            }
        }
    }
}
