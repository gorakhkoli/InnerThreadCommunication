import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Company 
{
	//int a;
	BlockingQueue<Integer> blockingQueue= new LinkedBlockingQueue<>();
	//boolean flag= false;
	 public void producerData(int a) throws InterruptedException
	{
		/*
		 * if(flag) { wait(); }
		 */
		blockingQueue.add(a);
		System.out.println("produce data :"+a);
		//flag= true;
		//notify();
	}
	
	 public void consumerData() throws InterruptedException
	{
		/*
		 * if(!flag) { wait(); }
		 */
		System.out.println("consumer data :"+blockingQueue.take());
		//flag= false;
		//notify();
		
	}
}
