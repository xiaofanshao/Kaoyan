package kaoyan.fushi;

import java.util.Scanner;

public class SingleNumber2 {
/**
 * @author xiaofanshao
 * https://wenda.jisuanke.com/nanti/15?question_id=5073
 * 和0取异或变为相反 和1取与是取位
 * 单独取位可以用移位+与1相与   e.g  (a>>2)&1 取倒数第三位 (a>>0)&1取倒数第一位
 * ？？？此处不知道是如何根据01推导出来表达式的
 * 日期：2018.1.18
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
