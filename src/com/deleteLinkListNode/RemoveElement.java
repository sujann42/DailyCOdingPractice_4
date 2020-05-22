package com.deleteLinkListNode;


public class RemoveElement {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode n = tempNode;
        while(n.next != null){
            if(n.next.val == val){
                tempNode.next = n.next.next;
                return tempNode.next;
            }else {
                n = n.next;
            }
        }
        return tempNode.next;
    }
}
