package thread_producer_consumer_demo_task3;

public class ProducerConsumer {
	
	public static void main(String[] args) {
		
	
	CubbyHole c = new CubbyHole();
    Producer p1 = new Producer(c, 1);
    Consumer c1 = new Consumer(c, 1);
    p1.start(); 
    c1.start();

	}
}

//Problem
//Making sure the producer wont try to add data into the buffer if its still full 
//and that the consumer wont try to remove data from an empty buffer.


//Solution
//The producer is either to go to sleep or discard if the buffer is full. The next time the consumer removes an item from the buffer
//it notifies the producer, who starts to fill the buffer again. In the same way, the consumer can go to sleep if 
//it finds the buffer is empty. The next time the producer puts data into the buffer, it wakes up the sleeping consumer. 