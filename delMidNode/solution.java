class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class solution{

    static ListNode deleteMiddle(ListNode node) {
        if(node.next==null) return null;
        int length = 0;
        ListNode temp = node;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int mid = length/2;
        length = 0;
        temp = node;
        while(temp!=null){
            if(length==mid-1){
                temp.next = temp.next.next;
                break;
            }
            length++;
            temp=temp.next;
        }
        return node;
    }

    public static void main(String[] args) {
     
        
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;
        deleteMiddle(n1);
        ListNode temp = n1;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}