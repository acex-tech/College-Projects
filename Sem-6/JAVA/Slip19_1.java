import java.util.LinkedList;

public class Slip19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(-1);
		list.add(45);
		list.add(-18);
		list.add(-14);
		list.add(-12);
		list.add(-165);
		list.add(-101);	list.add(581);
		list.add(581);
		for (int i: list)
		{
			if(i<0)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
