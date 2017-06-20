package laicode_java;

//Closest number in sorted array
public class Solution12 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public int coloset(int[] array, int target) {
		if(array==null || array.length==0) {
			return -1;
		}
		int left=0, right=array.length-1;
		while(left<right-1) {
			int mid=left+(right-left)/2;
			if(array[mid]==target) {
				return mid;
			}
			else if(array[mid]<target) {
				left=mid;
			}
			else {
				right=mid;
			}
		}
		if(Math.abs(array[left]-target)<=Math.abs(array[right]-target)) {
			return left;
		}
		else {
			return right;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution12 s12 = new Solution12();
		int[] matrix={1, 3, 3, 4};
		int result=s12.coloset(matrix, 2);
		System.out.println(result);
		return;
	}
}
