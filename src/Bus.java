
public class Bus extends Thread
{
	@Override
	public void run() 
	{
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();//print exception
		}
		System.out.println(Thread.currentThread().getName());
	}
}
