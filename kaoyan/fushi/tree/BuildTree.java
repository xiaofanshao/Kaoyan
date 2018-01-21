package kaoyan.fushi.tree;

public class BuildTree {
	/**
	 *  ǰ���У�1 2 4 7 3 5 6 8
	 *  �����У�4 7 2 1 5 3 8 6
	 * @param args
	 */
	public static class BinaryTreeNode {  
        int value;  
        BinaryTreeNode left;  
        BinaryTreeNode right;  
    }  
	public static BinaryTreeNode construct(int[] preorder, int[] inorder) {  
        // ����ĺϷ����жϣ��������鶼����Ϊ�գ����Ҷ������ݣ��������ݵ���Ŀ��ͬ  
        if (preorder == null || inorder == null || preorder.length != inorder.length || inorder.length < 1) {  
            return null;  
        }  
        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);  
    }  

	 public static BinaryTreeNode construct(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {  
	        // ��ʼλ�ô��ڽ���λ��˵���Ѿ�û����Ҫ�����Ԫ����  
	        if (ps > pe) {  
	            return null;  
	        }  
	        // ȡǰ������ĵ�һ�����֣����ǵ�ǰ�ĸ����  
	        int value = preorder[ps];  
	        int index = is;  
	        // ������������������Ҹ�����λ��  
	        while (index <= ie && inorder[index] != value) {  
	            index++;  
	        }  
	        // ������������������������û���ҵ���˵������Ĳ����ǲ��Ϸ��ģ��׳��쳣  
	        if (index > ie) {  
	            throw new RuntimeException("Invalid input");  
	        }  
	        // ������ǰ�ĸ���㣬����Ϊ��㸳ֵ  
	        BinaryTreeNode node = new BinaryTreeNode();  
	        node.value = value;  
	        // �ݹ鹹����ǰ����������������������Ԫ�ظ�����index-is+1��  
	        // ��������Ӧ��ǰ�������λ����[ps+1, ps+index-is]  
	        // ��������Ӧ�����������λ����[is, index-1]  
	        node.left = construct(preorder, ps + 1, ps + index - is, inorder, is, index - 1);  
	        // �ݹ鹹����ǰ����������������������Ԫ�ظ�����ie-index��  
	        // ��������Ӧ��ǰ�������λ����[ps+index-is+1, pe]  
	        // ��������Ӧ�����������λ����[index+1, ie]  
	        node.right = construct(preorder, ps + index - is + 1, pe, inorder, index + 1, ie);  
	        // ���ش����ĸ����  
	        return node;  
	    }  
	 public static void printTree(BinaryTreeNode root) {  
	        if (root != null) {  
	            printTree(root.left);  
	            System.out.print(root.value + " ");  
	            printTree(root.right);  
	        }  
	    }  
	  private static void test5() {  
	        int[] preorder = {1, 2, 4, 5, 3, 6, 7};  
	        int[] inorder = {4, 2, 5, 1, 6, 3, 7};  
	        BinaryTreeNode root = construct(preorder, inorder);  
	        printTree(root);  
	    }  
	 public static void main(String[] args) {
		 test5(); 
	}
}
