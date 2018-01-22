package kaoyan.fushi;

public class PrimeMax {
	/**
	 * @author xiaofanshao
	 * 对460897024求最大质因数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=460897024;
		
		int index=2;
		int max=1;
		
		while(index++<num) {
			if(Isprime(index) && num%index==0 ) {
				num=num/index;
				max=index;
			}
		}
		System.out.println(max);
	}
	
	private static boolean Isprime(int a) {
		for(int i=2;i<=a/2;++i) {
			if(a%i==0) return false;
		}
		return true;
	}

}
