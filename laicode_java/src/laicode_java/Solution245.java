package laicode_java;

import java.util.*;

//Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.
public class Solution245 {
	public String longestCommonPrefix(String[] strs) {
		String common="";
		if(strs==null || strs.length<2) {
			return common;
		}
		common = strs[0];
		for(int i=1; i<strs.length; i++) {
			common = commonHelper(common, strs[i]);
		}
		return common;
	}
	
	private String commonHelper(String a, String b) {
		if(a==null || b==null) {
			return null;
		}
		int i=0, j=0;
		String result="";
		for(; i<a.length() && j<b.length();) {
			if(a.charAt(i)==b.charAt(j)) {
				result+=a.charAt(i);
				 i++; j++;
			}
			else {
				break;
			}
		}
		return result;
	}
	
	public int shortestWordDistance(String[] words, String word1, String word2) {
		if(word1.equals(word2)) {
			int p1 = -1, p2 = -1;
			int res = Integer.MAX_VALUE;
			for(int i=0; i<words.length; i++) {
				if(words[i].equals(word1)) {
					if(p1==-1) {
						p1=i;
					} else if(p2==-1) {
						p2=i;
						res = Math.min(res, p2-p1);
					} else {
						p1 = p2;
						p2 = i;
						res = Math.min(res, p2-p1);
					}
				}
			}
			return res;
		} else {
			int p1 = -1, p2 = -1;
			int res = Integer.MAX_VALUE;
			for(int i=0; i<words.length; i++) {
				if(words[i].equals(word1)) {
					p1=i;
					if(p2!=-1) {
						res = Math.min(res, p1-p2);
					}
				} else if(words[i].equals(word2)) {
					p2=i;
					if(p1!=-1) {
						res = Math.min(res, p2-p1);
					}
				}
			}
			return res;
		}
	}
	
	public static void main(String[] args) {
		Solution245 ss = new Solution245();
		String[] strs = new String[]{"aacb", "aab", "aa"};
		System.out.println(ss.longestCommonPrefix(strs));

	}
}
