package com.kinses38.OHDOC.day9.LeetCode;

import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString(){
        return ""+this.val ;
    }
}


public class AddTwoNumbers {

    static ListNode addTwoNumbers(ListNode first, ListNode second){
        ListNode result = new ListNode();
        String firstVal = getNode(first);
        String secondVal = getNode(second);
        String answer = String.valueOf(new BigInteger(firstVal).add( new BigInteger(secondVal)));
        result = createNewNode(answer,result);
        return result;
    }

    static String getNode(ListNode node){
        StringBuilder number = new StringBuilder();
        number.insert(0,node.val);
        if(node.next == null){
            return number.toString();
        }

        return number.insert(0,getNode(node.next)).toString();
    }

    static ListNode createNewNode(String num, ListNode node){
        ListNode tmp = node;
        while(num.length() > 0){
            tmp.val = Integer.parseInt(num.substring(num.length()-1));
            if(num.length()>1){
                tmp.next = new ListNode();
                tmp = tmp.next;
            }
            num = num.substring(0, num.length()-1);
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

        ListNode result = addTwoNumbers(l1, l2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}
