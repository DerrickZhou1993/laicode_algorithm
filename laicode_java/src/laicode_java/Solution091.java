package laicode_java;

import java.util.*;

//Array Hopper IV
//	Given an array A of non - negative integers, you are initially positioned at an arbitrary index of the array.A[i] means the maximum jump distance from that position(you can either jump left or jump right).Determine the minimum jumps you need to reach the right end of the array.Return - 1 if you can not reach the right end of the array.

//	Assumptions

//	The given array is not null and has length of at least 1.
//	Examples

//{ 1, 3, 1, 2, 2 }, if the initial position is 2, the minimum jumps needed is 2 (jump to index 1 then to the right end of array)

//{ 3, 3, 1, 0, 0 }, if the initial position is 2, the minimum jumps needed is 2 (jump to index 1 then to the right end of array)

// { 4, 0, 1, 0, 0 }, if the initial position is 2, you are not able to reach the right end of array, return -1 in this case.
public class Solution091 {
	public int minJump(int[] array, int index) {
		int leng=array.length;
		int[] cancome=new int[leng];
		Arrays.fill(cancome, Integer.MAX_VALUE);
		if(leng<=index || index<0) {
			return -1;
		}
		cancome[index]=0;
		minJumpHelper(array, leng, index, cancome);
		if(cancome[leng-1]==Integer.MAX_VALUE) {
			return -1;
		}
		else {
			return cancome[leng-1];
		}
		
	}
	
	private void minJumpHelper(int[] array, int leng, int index, int[] cancome) {
		if(index<0 || index>=leng || array[index]==0) {
			return ;
		}
		for(int i=1; i<=array[index]; i++) {
			if(i+index<leng && cancome[index+i]>cancome[index]+1) {
				cancome[index+i]=cancome[index]+1;
				minJumpHelper(array, leng, index+i, cancome);
			}
			if(index-i>=0 && cancome[index-i]>cancome[index]+1) {
				cancome[index-i]=cancome[index]+1;
				minJumpHelper(array, leng, index-i, cancome);
			}
		}
	}
	
	public static void main(String[] args) {


	}
}
