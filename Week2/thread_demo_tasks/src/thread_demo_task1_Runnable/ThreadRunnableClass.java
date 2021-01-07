package thread_demo_task1_Runnable;

public class ThreadRunnableClass {

	public static void main(String a[]){
		
		SampleThreadRunnable str = new SampleThreadRunnable();
        
		Thread t = new Thread(str);
        
		t.start();
        
		while(SampleThreadRunnable.myCount <= 10){
            try{
                System.out.println("Main Thread Runnable: "+(++SampleThreadRunnable.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Exception : "+e.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
//Runnable is a functional interface that creates a thread. Difference is the can save space for other classes to extend to. 