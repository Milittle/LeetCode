/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Test237 {
    public static void main(String[] args) {

    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
