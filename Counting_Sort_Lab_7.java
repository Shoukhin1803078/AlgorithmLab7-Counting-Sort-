package algorithm;

import java.io.File;
import java.util.Scanner;

public class Counting_Sort_Lab_7{
	
	

	public static void main(String[] args){
		try{
			File f=new File("seventhousand_value.txt");
			Scanner ob=new Scanner(f);
			int n=ob.nextInt();
			int a[]=new int[n];
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				a[i]=ob.nextInt();
				max=Math.max(max,a[i]);
			}
			
			long start_time=System.nanoTime();
			
			int b[]=new int[max+1];
			for(int i=0;i<a.length;i++){
				b[a[i]]++;
			}
			for(int i=1;i<b.length;i++){
				b[i]=b[i]+b[i-1];
			}
			//for(int i=0;i<b.length;i++){
			//	System.out.println(i+" "+b[i]);
			//}
			int sorted_array[]=new int[b[b.length-1]];
			for(int i=0;i<a.length;i++){
				int pos=b[a[i]];
				sorted_array[pos-1]=a[i];
				b[a[i]]--;
			}
			
			long stop_time=System.nanoTime();
			System.out.println(stop_time-start_time);
			
			
			//for(int i=0;i<sorted_array.length;i++){
			//	System.out.println(sorted_array[i]);
			//}
		}catch(Exception e){

		}

	}
}
