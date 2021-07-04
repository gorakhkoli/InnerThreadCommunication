
public class Producer implements Runnable
{

	Company c;
	Producer(Company c)
	{
		this.c= c;
	}
	@Override
	public void run() 
	{
		int i=1;
		while(true)		
		{
			
			try 
			{
				c.producerData(i);
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			i++;
		}
		
	}

}
