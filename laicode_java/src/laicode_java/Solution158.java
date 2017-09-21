package laicode_java;

import java.util.*;

//Set Matrix Zeroes
//	Given a m x n matrix, if an element is 0, set its entire row and column to 0.
//	E.g.Input: Matrix = [
//			[1, 1, 1, 1, 0],
//			[0, 1, 1, 0, 1],
//			[1, 1, 1, 0, 1],
//			[1, 1, 1, 1, 1]
//	]
//	Output: Matrix = [
//					[0, 0, 0, 0, 0],
//					[0, 0, 0, 0, 0],
//					[0, 0, 0, 0, 0],
//					[0, 1, 1, 0, 0],
//			]
/*
 * ������һ�е�һ�еõ�firstrow   firstcol
 * ��������Ԫ�� ��==0 ���һ�� ��һ��==0
 * rows 0 0 0 1
 * cols 0 1 1 0 0
 * ��������Ԫ�� ����һ�� ��һ��Ϊ0�� ��Ϊ0
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 1 1 0 0
 * ����firstrow firstcol�õ�һ�е�һ��
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 1 1 0 0
 * 
 */
public class Solution158 {
	public int[][] setZero(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[] m = new int[rows];
		Arrays.fill(m, 1);
		int[] n = new int[cols];
		Arrays.fill(n, 1);
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(matrix[i][j]==0) {
					m[i]=0; n[j]=0;
				}
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(m[i]==0 || n[j]==0) {
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		Solution158 ss = new Solution158();
		int[][] matrix  = {
				{1, 1, 1, 1, 0},
				{0, 1, 1, 0, 1},
				{1, 1, 1, 0, 1},
				{1, 1, 1, 1, 1} };
		matrix = ss.setZero(matrix);
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
