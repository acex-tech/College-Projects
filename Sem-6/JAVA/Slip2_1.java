/*1. Write a java program to read ‘N’ names of your friends, store it into HashSet and
display them in ascending order.     */

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Slip2_1 {

	public static void main(String[] args) {
     HashSet<String> hs=new HashSet<>();
     int n;
     Scanner sc=new Scanner(System.in);
    		 System.out.println("enter n");
     n=sc.nextInt();
     sc.nextLine();
     System.out.println("enter names ");
     for(int i=0; i<n; i++)
     {
    	 hs.add(sc.nextLine());
     }
     System.out.println("Hash set"+hs);
    		 System.out.println("Ascending order");



	TreeSet<String> ts=new TreeSet(hs);
	 System.out.println("Hash set"+ts);

	}

}
