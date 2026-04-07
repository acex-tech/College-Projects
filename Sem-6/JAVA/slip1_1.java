//Java -II slips for practical exam are slip no.1,2,3,7,8,11,12,13,14,,15,16,18,19,21,23,26,28,29,30

public class slip1_1 {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();


	}

}
class MyThread extends Thread{
	@Override
	public void run()
	{
		for(char c='A';c<='Z'; c++)
		{
		System.out.println(c);
		try {
			Thread.sleep(2000);
		}catch(Exception e)
		{

		}
		}
	}
}
