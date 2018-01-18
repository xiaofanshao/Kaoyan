package kaoyan.Algospace.chapter_9;
/**
 * 
 * @author xiaofanshao
 * 9.2 次序统计量
 * 期望为线性时间的选择算法
 */

public class RamdomSelect {

	public static void main(String[] args) {
		int []a= {
				7,4,3,1,2,9,8,5,6,10
		};
		int m=9;
		int k=rs(a,0,10,m);//rs是主要的选择算法
		show(a);
		System.out.println("第"+m+"小的元素是"+k);
		
	}
	
	/**
	 * 
	 * @param a 数组名字
	 * @param p 起始序号
	 * @param r 结束序号
	 * @param k 选定第k小
	 * @return 返回第k小的元素
	 * [p,r) 
	 */
	public static  int rs(int[] a,int p,int r,int k) {
		if(p+1==r) {
			return a[p];
			
		}
		int q=partition(a, p, r);
		int t= q-p;
		if(t+1==k) //q前面有t个元素，也就是分位点是t+1小的元素
		{
			return a[q];
			
		}
		else if(t+1<k)
			return rs(a,q+1,r,k-(t+1)); //选定分位点右侧，注意是k-(t+1)
		else
			return rs(a,p,q,k);
	}
	 private static int partition(int[] a,int p,int r) {//lomote的快速排序实现
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
