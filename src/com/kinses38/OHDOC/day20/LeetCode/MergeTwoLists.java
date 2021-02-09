package com.kinses38.OHDOC.day20.LeetCode;


class ListNode {
	int val;
	KListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, KListNode next) {
		this.val = val;
		this.next = next;
	}
}


public class MergeTwoLists {

	public static KListNode mergeTwoLists(KListNode l1, KListNode l2) {
		KListNode head = new KListNode();
		KListNode tmp = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				tmp.next = l1;
				l1 = l1.next;
			} else {
				tmp.next = l2;
				l2 = l2.next;
			}
			tmp = tmp.next;
		}

		if (l1 != null) tmp.next = l1;
		if (l2 != null) tmp.next = l2;


		return head.next;
	}


	public static void main(String[] args) {
		KListNode l1 = new KListNode(1);
		KListNode l1n = new KListNode(2);
		KListNode l1nn = new KListNode(4);
		l1.next = l1n;
		l1n.next = l1nn;

		KListNode l2 = new KListNode(1);
		KListNode l2n = new KListNode(3);
		KListNode l2nn = new KListNode(4);
		l2.next = l2n;
		l2n.next = l2nn;

		KListNode ans = mergeTwoLists(l1,l2);
		while(ans != null){
			System.out.printf("%d,", ans.val);
			ans = ans.next;
		}
	}
}
