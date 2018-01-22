package kaoyan.fushi;

import java.util.Scanner;
/**
 * https://nanti.jisuanke.com/t/6 
 * @author xiaofanshao
 * 日期：2018.1.17
 */
public class Nisuke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; int a,b,c;//长宽高
		int [] status;
		String [] name; 
		String taker="";String owner="";
		
		Scanner sc=new Scanner(System.in);
		int flag=sc.nextInt();
		
		while(flag!=-1) {
			
			n=flag;
			status=new int[n];
			name=new String[n];
			for(int i=0;i<n;i++) {
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
				status[i]=a*b*c;
				name[i]=sc.next();
			}
			
			int sum=0;int average;
			for(int i=0;i<n;i++) {
				sum+=status[i];
			}
			average=sum/n;
			
			for(int i=0;i<n;i++) {
				if(status[i]<average) owner=name[i];
				if(status[i]>average) taker=name[i];
			}
			System.out.println(taker+" took clay from "+owner+".");
			flag=sc.nextInt();
		}
			
		
		
	}

}
