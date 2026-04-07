import java.util.Random;

public class Slip7_1 {
	public static void main(String[] args) {
		new RandomThread().start();
		
	}

}
class RandomThread extends Thread{
	int n;
	public void run()
	{  try {
		
	
		Random r=new Random();
		 n=r.nextInt(10);
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
	}
	
	
		 
		if(n%2==0)
		{
			EventThrad e=new EventThrad(n);
			e.start();
		}
		else
		{
			OddThread1 o=new OddThread1(n);
			o.start();
		}
		
		
	}
}
class EventThrad extends Thread {
	int n;
	EventThrad(int n)
	{
		this.n=n;
		
	}
	public void run()
	{
		
		System.out.println("Even number :"+n+"Square:"+n*n*n);
	}
	
}

class OddThread1 extends Thread{
	
int n;
OddThread1(int n)
{
	this.n=n;
	
}
public void run()
{
	
	System.out.println("odd number :"+n+"Cube:"+n*n);
}

}
