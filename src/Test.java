
public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		Bus bus1 = new Bus();
		Bus bus2= new Bus();
		Bus bus3 = new Bus();
		Bus bus4 = new Bus();
		Bus bus5 = new Bus();

		bus1.setName("B1");
		bus2.setName("B2");
		bus3.setName("B3");
		bus4.setName("B4");
		bus5.setName("B5");
		bus1.start();
		bus1.join();
		bus2.start();
		bus2.join();
		bus3.start();
		bus3.join();
		bus4.start();
		bus4.join();
		bus5.start();
		
		
		
	}

}
