package kaoyan.fushi;

import java.util.Random;

/***
 * 
 * @author xiaofanshao
 * 计数排序
 */
public class CounterSort {
	public static void main(String[] args) {
//		初始化
		Random random= new Random();
		int[] a=new int[10];

		for(int i=0;i<10;i++ ) {
			a[i]=random.nextInt(50);
		}
		
		System.out.println("随即数列");
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
//		排序 排序之后的数组是B
		
		int [] k=new int[51];
		int [] b=new int[10];
		
		for(int i=0;i<10;i++) {
			++k[a[i]+1];
		}
		
		for(int i=1;i<51;++i) {
			k[i]+=k[i-1];
		}
		for(int i:a) {
			b[k[i]++]=i;
		}
		
//		排序好的数列
		System.out.println("排序好的数列");
		for(int i:b) {
			System.out.print(i+" ");
		}
		
		
		
	}
}
