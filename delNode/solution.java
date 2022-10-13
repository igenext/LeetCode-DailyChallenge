
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class solution{

    static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
     
        
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        deleteNode(n2);
        ListNode temp = n1;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}