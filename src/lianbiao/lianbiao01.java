package lianbiao;

/**
 * Created by qsong on 2017/1/2.
 */
public class lianbiao01 {
    public Node reverse(Node current) {
        //initialization
        Node previousNode = null;
        Node nextNode = null;

        while (current != null) {
            //save the next node
            nextNode = current.next;
            //update the value of "next"
            current.next = previousNode;
            //shift the pointers
            previousNode = current;
            current = nextNode;
        }
        return previousNode;
    }
    public boolean youhuan(Node head){
        Node fast = head;
        Node slow = head;
        if( head == null|| head.next == null|| head.next.next == null){
            return false;
        }
        while (fast !=null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }

        }
        return false;

    }
    public Node rukou(Node head){
        if (!youhuan(head)){
            return null;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        fast = head;
        while (slow !=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }
}
