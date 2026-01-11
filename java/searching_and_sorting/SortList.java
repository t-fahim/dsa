// 148. Sort List
// https://leetcode.com/problems/sort-list/

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head); // sort the first half
        ListNode right = sortList(mid); // sort the second half


        // Marge the sorted
        return merge(left, right);

    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // split the list into two halves
        prev.next = null;
        return slow;
    }


    // Function to merge two sorted lists
    private ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        // append the remaining nodes of list1 or list2
        tail.next = (list1 != null)? list1 : list2;
        return dummy.next;
    }
}






public class SortList {
    public static void main (String[] args) {


    //Solution sol = new Solution();
    //System.out.println();
    }
}

