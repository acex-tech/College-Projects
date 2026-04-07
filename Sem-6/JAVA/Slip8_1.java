
public class Slip8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mythread("Covid-19",10).start();
		new Mythread("lockdown",20).start();

		new Mythread("vaccine",30).start();


	}

}
class Mythread extends Thread{
	int n;
	String text;
	Mythread(String text,int n)
	{
		this.text=text;
		this.n=n;
		
	}
	public void run()
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(text);
		}
	}
	
}