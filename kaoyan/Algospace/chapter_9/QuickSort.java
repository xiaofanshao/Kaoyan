package kaoyan.Algospace.chapter_9;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
/***
 * 
 * @author xiaofanshao
 * 快速排序lomote写法
 */
public class QuickSort {
	public int [] a;
	
	
	
	public QuickSort() {
		this.a= new int[10];
		Random random= new Random();
		for(int i=0;i<10;i++ ) {
			a[i]=random.nextInt(50);
		}
		System.out.print("原始情况：");
		show(a);
		int pivotekey=partition(a,0,10);
		System.out.print("更新情况:");
		show(a);
		System.out.println("中心是"+a[pivotekey]+"位置是"+pivotekey);
	}

	public static void main(String[] args) {
		//初始化
	}

	public int[] get() {
		return a;
	}
	 public int partition(int[] a,int p,int r) {
		int i=p;
		int x=a[r-1];
		
		for(int j=p;j<r-1;++j) {
			if(a[j]<=x) {
				swap(a,i,j);
				++i;
			}
		}
		swap(a,i,r-1);
		return i;
	}
	private static void swap(int []a,int i,int j) {
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	private static void show(int []a) {
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
