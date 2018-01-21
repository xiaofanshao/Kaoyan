package kaoyan.fushi;

import java.util.Scanner;

public class ClimbStairs {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		cl(n);
		System.out.println(count);
		
	}
	private  static void cl(int n) {
		if(n==1||n==2) {
			count++;
		}else {
			cl(n-1);
			cl(n-2);
		}
	}

}
