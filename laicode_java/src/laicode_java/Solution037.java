package laicode;

import java.util.*;

public class Solution037 {
//  Check If Linked List Has A Cycle
//  Check if a given linked list has a cycle. Return true if it does, otherwise return false.
	boolean hasCycle(ListNode head) {
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && slow!=null) {
			fast=fast.next;
			slow=slow.next;
			if(fast!=null) {
				fast=fast.next;
			}
			else {
				return false;
			}
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Solution037 ss=new Solution037();
	}
}
