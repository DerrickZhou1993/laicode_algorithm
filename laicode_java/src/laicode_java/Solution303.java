package laicode_java;

import java.util.*;

//Connect Right Pointer To Successor
//Connect the node whose right child is NULL to the successor node in in-order sequence.
//Examples:
//  11
// /  \
//2     29
///  \  /  \
//1   7 15  40
///
//35
//the added edges are:
//1.right = 2
//7.right = 11
//15.right = 29
//35.right = 40
public class Solution303 {
	void linkRightToSuccessor(TreeNode root, TreeNode prev) {
		if(root==null) {
			return;
		}
		linkRightToSuccessor(root.right, prev);
		if(prev!=null && root.right==null) {
			root.right = prev;
		}
		prev = root;
		
		linkRightToSuccessor(root.left, prev);
	}
	
	public static void main(String[] args) {


	}
}
