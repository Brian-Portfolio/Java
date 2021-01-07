package thread_demo_task1;

public class ThreadClass {

	public static void main(String[] args) {
		SampleThread st = new SampleThread();
		
		st.start();
		
		while(SampleThread.myCount<=10) {
			try{
                System.out.println("Main Thread: "+(++SampleThread.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Exception : "+e.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
		
}
//To create a thread we can use the extending a thread technique. Difference is it cannot be extended to multiple classes.
