/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.io.File;
import java.util.Scanner;

public class Bubble_sort_Lab_7{

	public static void main(String[] args){
		try{
			File f=new File("seventhousand_value.txt");
			Scanner ob=new Scanner(f);
			int n=ob.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=ob.nextInt();
			}
			long t1=System.nanoTime();
			for(int i=0;i<n;i++){
				for(int j=0;j<n-i-1;j++){
					if(a[j]>a[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			long t2=System.nanoTime();
			System.out.println(t2-t1);
			//for(int i=0;i<n;i++){
			//	System.out.println(a[i]);
			//}

		}catch(Exception e){

		}

	}
}
