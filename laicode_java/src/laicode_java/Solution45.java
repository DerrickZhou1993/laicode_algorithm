package laicode_java;
import java.util.*;

//Remove certain Characters
public class Solution45 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public String remove(String input, String t) {
		char[] array=input.toCharArray();
		Set<Character> set=buildSet(t);
		int slow=0;
		for(int fast=0;fast<array.length;fast++) {
			if(!set.contains(array[fast])) {
				array[slow++]=array[fast];
			}
		}
		return new String(array, 0, slow);
	}
	
	private Set<Character> buildSet(String t) {
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<t.length();i++) {
			set.add(t.charAt(i));
		}
		return set;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution45 s45 = new Solution45();
		String result=s45.remove("abcd", "ab");
		System.out.println(result);
		return;
	}
}
