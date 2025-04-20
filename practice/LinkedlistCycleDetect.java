package com.example.demo.practice;

import java.util.HashSet;
import java.util.Set;

/**
  Definition for singly-linked list.
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      public int hashCode(){
          return val;
      }
      public boolean equals(ListNode node){
          if(this.val == node.val){
              return true;
          }else{
              return false;
          }
      }
}

public class LinkedlistCycleDetect {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode secondNode = new ListNode(7);
        head.next=secondNode;
        ListNode thirdNode = new ListNode(9);
        secondNode.next=thirdNode;
        ListNode fourthNode = new ListNode(11);
        thirdNode.next=fourthNode;
        fourthNode.next=head;
        ListNode repeatedNode = detectCycle(head);
        if(repeatedNode == null){
            System.out.println("No cycle detected");
        }else{
            System.out.println("Cycle detected at "+ repeatedNode.val);
        }
    }


    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(!set.contains(head)){
                set.add(head);
                head=head.next;
            }
            if(set.contains(head)){
                return head;
            }
        }
        return null;
    }

}
