package com.kinses38.OHDOC.day20.LeetCode;

import java.util.PriorityQueue;

//Renamed just so could have in the same package.
class KListNode {
	int val;
	KListNode next;

	KListNode() {
	}

	KListNode(int val) {
		this.val = val;
	}

	KListNode(int val, KListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeKLists {

	public static KListNode mergeKLists(KListNode[] lists) {
		PriorityQueue<KListNode> queue = new PriorityQueue<>((a, b) -> (a.val - b.val));
		for (KListNode node : lists) {
			if (node == null) continue;
			queue.offer(node);
		}

		KListNode head = new KListNode(0);
		KListNode current = head;

		while (!queue.isEmpty()) {
			current.next = queue.poll();
			current = current.next;
			//move node to next, reducing the "stack"
			if (current.next != null) {
				queue.offer(current.next);
			}
		}
		return head.next;
	}

	public static void main(String[] args) {
		KListNode node = new KListNode(1, new KListNode(3, new KListNode(4)));
		KListNode node2 = new KListNode(2, new KListNode(4, new KListNode(5)));
		KListNode node3 = new KListNode(1, new KListNode(2, new KListNode(6)));

		KListNode[] arr = {node, node2, node3};
		KListNode ans = mergeKLists(arr);

		while(ans != null){
			System.out.printf("%d,", ans.val);
			ans = ans.next;
		}
	}
}
