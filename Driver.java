public class Driver 
{
	public static void main(String[] args)
	{
		double startTime = System.currentTimeMillis(); 
		PCB_v1 zero = new PCB_v1(-1,0);
		
		for(int i = 0; i < 100000; i++)
		{
			zero.create();
			zero.create();
			zero.getChildren()[1].create();
			zero.create();
			zero.destroy();
		}
		
		double elapsedTime = System.currentTimeMillis() - startTime; 
		
		
		System.out.println("Total amount of time for Version 1: " + elapsedTime);
		double startTime2 = System.currentTimeMillis();
		PCB_v2 zero2 = new PCB_v2(-1, 1, -1, -1);
		for(int j = 0; j < 100000; j++)
		{
			PCB_v2 one = new PCB_v2(0, -1, 2, -1);
			PCB_v2 two = new PCB_v2(0, 3, 4, 1);
			PCB_v2 three = new PCB_v2(2, -1, -1, -1);
			PCB_v2 four = new PCB_v2(0, -1, -1, 2);
			
			zero2.destroy();
			one.destroy();
			two.destroy();
			three.destroy();
			four.destroy();
		}
		double elapsedTime2 = System.currentTimeMillis() - startTime2; 
		System.out.println("Total amount of tiem for Version 2: " + elapsedTime2);
	}
}
