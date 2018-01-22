package kaoyan.fushi;

import java.util.Scanner;

/**
 * 
 * @author xiaofanshao
 * https://nanti.jisuanke.com/t/15 
 * 独特的数字 只出现一次的数字
 *  日期：2018.1.18
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int [] a=new int[500];
		int [] bits=new int[32];
		
		int n=sc.nextInt();
		for(int i=0;i<n;++i) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<32;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=(a[j]>>i)&1;
			}
			sum=sum%3;
			bits[i]=sum;
		}
		
		int result=0;
		for(int i=0;i<32;i++) {
			result+=bits[i]<<i;
		}
		System.out.print(result);
	}

}
