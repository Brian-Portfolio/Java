package interthread_communicaton_demo_task2;

public class InterThreadDemo {
	
	int amount=10000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
	if(this.amount<amount){  
	System.out.println("Less balance; waiting for deposit...");  
	try{
		wait();
	}catch(Exception e){System.out.println(e);}  
	}  
	
	
	this.amount-=amount;  
	System.out.println("withdraw completed...");  
	}  
	  
	synchronized void deposit(int amount){  
	System.out.println("going to deposit...");
	
	this.amount+=amount;  
	System.out.println("deposit completed... ");  
	notify();  
	}  
}  
	
//1. Threads enter to acquire lock.
//2. Lock is acquired by on thread.
//3. Now thread goes to waiting state if you call wait() method on the object. Otherwise it releases the lock and exits.
//4. If you call notify() or notifyAll() method, thread moves to the notified state (runnable state).
//5. Now thread is available to acquire lock.
//6. After completion of the task, thread releases the lock and exits the monitor state of the object.
