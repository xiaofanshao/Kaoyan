package kaoyan.Algospace.chapter_9;
/**
 * 
 * @author xiaofanshao
 * 9.2 ����ͳ����
 * ����Ϊ����ʱ���ѡ���㷨
 */

public class RamdomSelect {

	public static void main(String[] args) {
		int []a= {
				7,4,3,1,2,9,8,5,6,10
		};
		int m=9;
		int k=rs(a,0,10,m);//rs����Ҫ��ѡ���㷨
		show(a);
		System.out.println("��"+m+"С��Ԫ����"+k);
		
	}
	
	/**
	 * 
	 * @param a ��������
	 * @param p ��ʼ���
	 * @param r �������
	 * @param k ѡ����kС
	 * @return ���ص�kС��Ԫ��
	 * [p,r) 
	 */
	public static  int rs(int[] a,int p,int r,int k) {
		if(p+1==r) {
			return a[p];
			
		}
		int q=partition(a, p, r);
		int t= q-p;
		if(t+1==k) //qǰ����t��Ԫ�أ�Ҳ���Ƿ�λ����t+1С��Ԫ��
		{
			return a[q];
			
		}
		else if(t+1<k)
			return rs(a,q+1,r,k-(t+1)); //ѡ����λ���Ҳ࣬ע����k-(t+1)
		else
			return rs(a,p,q,k);
	}
	 private static int partition(int[] a,int p,int r) {//lomote�Ŀ�������ʵ��
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
