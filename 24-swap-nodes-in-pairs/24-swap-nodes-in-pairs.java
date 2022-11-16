class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        ListNode prev = new ListNode(0);
        prev.next  = head;
        ListNode newHead = prev;
        while(prev.next!=null && prev.next.next!=null){
            ListNode node1 = prev.next;
            ListNode node2 = node1.next;
            ListNode nextNode = node2.next;
            
            prev.next = node2;
            node2.next = node1;
            node1.next = nextNode;
            
            prev = node1; 
        }
        return newHead.next;
    }
}