
public class Consumer implements Runnable
{
	Company c;
	Consumer(Company c)
	{
		this.c= c;
	}
	@Override
	public void run() 
	{
		while(true)	
		{
			try 
			{
				c.consumerData();
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
