package kaoyan.Algospace.chapter_9;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
/***
 * 
 * @author xiaofanshao
 * ��������lomoteд��
 */
public class QuickSort {
	public int [] a;
	
	
	
	public QuickSort() {
		this.a= new int[10];
		Random random= new Random();
		for(int i=0;i<10;i++ ) {
			a[i]=random.nextInt(50);
		}
		System.out.print("ԭʼ�����");
		show(a);
		int pivotekey=partition(a,0,10);
		System.out.print("�������:");
		show(a);
		System.out.println("������"+a[pivotekey]+"λ����"+pivotekey);
	}

	public static void main(String[] args) {
		//��ʼ��
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
