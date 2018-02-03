package basicpackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LinkedListSol {

	public static class LinkedListNode {
		int val;
		LinkedListNode next;

		LinkedListNode(int node_value) {
			val = node_value;
			next = null;
		}
	};

	public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
		if (head == null) {
			head = new LinkedListNode(val);
			tail = head;
		} else {
			tail.next = new LinkedListNode(val);
			tail = tail.next;
		}
		return tail;
	}

	static LinkedListNode removeNodes(LinkedListNode list, int x) {

		LinkedListNode curr = list;
		LinkedListNode prev = list;
		if (list == null) {
			return list;
		}
		while (curr != null) {
			if (curr.val > x) {
				if (prev == curr) {
					list = curr.next;
					curr = prev = list;
				} else {
					prev.next = curr.next;
					curr = curr.next;
				}
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		LinkedListNode res;

		int[] lists = { 2, 1, 3, 5, 10 };
		int _list_size = 5;
		int _list_i;
		int _list_item;
		LinkedListNode _list = null;
		LinkedListNode _list_tail = null;
		for (_list_i = 0; _list_i < _list_size; _list_i++) {
			_list_item = lists[_list_i];
			if (_list_i == 0) {
				_list = _insert_node_into_singlylinkedlist(_list, _list_tail, _list_item);
				_list_tail = _list;
			} else {
				_list_tail = _insert_node_into_singlylinkedlist(_list, _list_tail, _list_item);
			}
		}

		int _x = 5;

		res = removeNodes(_list, _x);
		while (res != null) {
			System.out.print(res.val + "  ");
			res = res.next;
		}
	}
}