class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp1,temp2,temp3;
        if(head==null) return head;
        temp1=head;
        if(head.next==null)return head;
        temp2=head.next;
        head=temp2;
        temp1.next=temp2.next;
        temp2.next=temp1;
        if(temp1.next==null)return head;
        temp3=temp1;
        temp1=temp1.next;
        if(temp1.next==null)return head;
        temp2=temp1.next;
        while(true)
        {
            temp3.next=temp2;
            temp1.next=temp2.next;
            temp2.next=temp1;
            temp3=temp1;
            if(temp1.next==null)break;
            temp1=temp1.next;
            temp2=temp1.next;
            if(temp2==null)break;
        }
        return head;
    }
}
