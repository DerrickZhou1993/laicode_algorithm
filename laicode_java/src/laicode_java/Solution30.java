package laicode_java;

//Tweaked Identical Binary Trees
public class Solution30 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public boolean isTweakedIdentical(TreeNode one, TreeNode two) {
		if(one==null && two==null) {
			return true;
		}
		else if(one==null || two==null) {
			return false;
		}
		else if(one.key!=two.key) {
			return false;
		}
		return isTweakedIdentical(one.left, two.left) && isTweakedIdentical(one.right, two.right) ||
			isTweakedIdentical(one.left, two.right) && isTweakedIdentical(one.right, two.left);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution30 s30 = new Solution30();
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t21=new TreeNode(2);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t41=new TreeNode(4);
		TreeNode t51=new TreeNode(5);
		t1.left=t2;
		t1.right=t21;
		t2.left=t4;
		t2.right=t5;
		t21.left=t51;
		t21.right=t41;
		TreeNode t10=new TreeNode(1);
		TreeNode t20=new TreeNode(2);
		TreeNode t210=new TreeNode(2);
		TreeNode t40=new TreeNode(4);
		TreeNode t50=new TreeNode(5);
		TreeNode t410=new TreeNode(4);
		TreeNode t510=new TreeNode(5);
		t10.left=t20;
		t10.right=t210;
		t20.left=t40;
		t20.right=t50;
		t210.left=t510;
		t210.right=t410;
		boolean result=s30.isTweakedIdentical(t1, t10);
		System.out.println(result);
		return;
	}
}
