package laicode_java;

import java.util.LinkedList;
import java.util.Queue;

//Check if binary tree is complete
public class Solution36 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public boolean isCompleted(TreeNode root) {
		if(root==null) {
			return true;
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		boolean flag=false;
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode cur=queue.poll();
			if(cur.left==null) {
				flag=true;
			}
			else if(flag) {
				return false;
			}
			else {
				queue.offer(cur.left);
			}
			if(cur.right==null) {
				flag=true;
			}
			else if(flag) {
				return false;
			}
			else {
				queue.offer(cur.right);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution36 s36 = new Solution36();
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(7);
		t4.left=t2;
		t4.right=t6;
		t2.left=t1;
		t2.right=t3;
		t6.left=t5;
		t6.right=t7;
		boolean result=s36.isCompleted(t4);
		System.out.println(result);
		return;
	}
}
