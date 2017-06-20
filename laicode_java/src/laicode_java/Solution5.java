package laicode_java;

import java.util.Arrays;

public class Solution5 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	private void swap(int[] array, int a, int b) {
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	public int[] rainbowSort(int[] array) {
		if (array==null || array.length<=1) {
			return array;
		}
		int neg=0;
		int one=array.length-1;
		int zero=0;
		while(zero<=one) {
			if (array[zero]==-1) {
				swap(array, zero, neg);
				zero++;
				neg++;
			}
			else if(array[zero]==0) {
				zero++;
			}
			else {
				swap(array, zero, one);
				one--;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution5 s5 = new Solution5();
		int[] array=new int[] {1,1,1,0,0,0,-1,-1,-1,1,0,0,1};
		array = s5.rainbowSort(array);
		System.out.println(Arrays.toString(array));
		return;
	}
}
