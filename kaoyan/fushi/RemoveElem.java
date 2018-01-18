package kaoyan.fushi;

import java.util.Scanner;
/**
 * https://nanti.jisuanke.com/t/9
 * @author xiaofanshao
 * ÈÕÆÚ£º2018.1.17
 */
public class RemoveElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[101];
		
		for(int i=0;i<n;i++) {
			int j=sc.nextInt();
			a[j]++;
		}
		int elem=sc.nextInt();
		
		a[elem]=0;
		
		int sum=0;
		for(int i=0;i<101;i++) {
			sum+=a[i];
		}
		
		
		
	}

}
