package kaoyan.fushi;


import java.util.Scanner;
/**
 * https://nanti.jisuanke.com/t/18
 * @author xiaofanshao
 * 贪心，每次都跳最大 看是否能跳出 
 * 日期：2018.1.20
 */
public class JumpGame {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] a=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int index=0;
        int period=0;
        
		while(index<n) {
			period=a[index];
            index+=period;
            if(period==0&&index<n-1) {
            	System.out.println("false");
            	return ;
            }
            if(period==0&& index==n-1) {
            	System.out.print("true");
            	return;
            }
        }
		if(index-period<=n-1)System.out.println("true");
		else System.out.println("false");
	}

}
