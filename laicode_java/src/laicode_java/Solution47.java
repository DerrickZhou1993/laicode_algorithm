package laicode_java;
import java.util.*;

//Remove adjacent repeated characters I
public class Solution47 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public String deDup(String input) {
		if(input==null) {
			return null;
		}
		char[] array=input.toCharArray();
		int end=0;
		for(int i=0;i<array.length;i++) {
			if(i==0 || array[i]!=array[end-1]) {
				array[end++]=array[i];
			}
		}
		return new String(array, 0, end);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution47 s47 = new Solution47();
		String result=s47.deDup("aaaabbbc");
		System.out.println(result);
		return;
	}
}
