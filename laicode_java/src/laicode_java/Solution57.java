package laicode_java;
import java.util.*;

//Longest substring with only unique chars
public class Solution57 {
	//����java�ļ�
	//for i in {3..100}; do cp Solution2.java "Solution$i.java"; done
	//����ĳһ��Ȼ���滻
	//for i in {3..100}; do head -3 "Solution$i.java" | tail -1 $1 | awk '{split($0, a, ' '); print a[3]' ; done
	//sed -i ' ' 's/hi/hello/' file1
	//���ĺ��Ƶ����ļ�
	//awk 'NR==2{gsub("hi", "Hello", $1)}; {print $0}' file1 > newfile
	//�������ͱ���Ҫ�á���˫����
	//for i in {3..100}; do sed -i " " "3s/Solution/Solution$i/" Solution$i.java ; done
	public int longest(String input) {
		Set<Character> distinct=new HashSet<>();
		int slow=0, fast=0;
		int longest=0;
		while(fast<input.length()) {
			if(distinct.contains(input.charAt(fast))) {
				distinct.remove(input.charAt(slow++));
			}
			else {
				distinct.add(input.charAt(fast++));
				longest=Math.max(longest, fast-slow);
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution57 s57 = new Solution57();
		int result=s57.longest("abcabcbbcda");
		System.out.println(result);
		return;
	}
}
