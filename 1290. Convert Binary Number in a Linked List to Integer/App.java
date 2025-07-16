

public class App {
    public static void main(String[] args) {
        getDecimalValue(0);
        }

    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }
}
