package interthread_communicaton_demo_task2;

public class ThreadClass {
	
	public static void main(String args[]){  
		final InterThreadDemo c=new InterThreadDemo();  
		
		new Thread(){  
		public void run(){
			c.withdraw(15000);
			}  
		}.start();  
		
		new Thread(){  
		public void run(){
			c.deposit(10000);
			}  
		}.start();  
	}
}
