package kaoyan.fushi;

import java.util.Scanner;

public class SingleNumber2 {
/**
 * @author xiaofanshao
 * https://wenda.jisuanke.com/nanti/15?question_id=5073
 * ��0ȡ����Ϊ�෴ ��1ȡ����ȡλ
 * ����ȡλ��������λ+��1����   e.g  (a>>2)&1 ȡ��������λ (a>>0)&1ȡ������һλ
 * �������˴���֪������θ���01�Ƶ��������ʽ��
 * ���ڣ�2018.1.18
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int x1=0,x2=0;
		while(count-->0) {
			int n=sc.nextInt();
			int y1=(n^x1)&~x2;
			int y2=~n&x2|n&x1;
			x1=y1;
			x2=y2;
		}
		System.out.println(x1);
	}

}
