package kaoyan.fushi;

import java.util.Scanner;

public class TwoDimentionSearch {
/**
 * ��ά�����еĲ���
 * ��ָoffer�����������
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {
				{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15}};
		int[] b= {1,2,8,9,
				2,4,9,12,
				4,7,10,13,
				6,8,11,15};
		
		if(search(a, 4, 4, 5)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	
	public static boolean search(int[][] a,int rows,int columns,int target) {
		boolean flag=false;
		int row=0;int column=columns-1;
		
		if(a!=null && rows>0 && columns>0) {
			while(row<rows&& column>=0) {
				if(target==a[row][column]) {
					flag=true;
					break;
				}else if(a[row][column]<target) {
					row++;
				}else {
					column--;
				}
			}
			
		}
		
		
		return flag;
	}

}
