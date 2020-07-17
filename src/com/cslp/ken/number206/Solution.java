package com.cslp.ken.number206;

public class Solution {

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    printNode(node1);
//    while (node1.next != null) {
//      System.out.println(node1.val);
//      node1 = node1.next;
//      if (node1.next == null) {
//        System.out.println(node1.val);
//      }
//    }
    node1 = reverseList(node1);
    System.out.println("--------------");

  }

  public static void printNode(ListNode node) {
    if (node == null) return;
    System.out.println(node.val);
    printNode(node.next);
  }
}

class ListNode {
  int val;
  ListNode next;

  public ListNode(int val) {
    this.val = val;
  }
}