//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode( 2, new ListNode(3)));
        ListNode l2 = new ListNode(4, new ListNode( 5, new ListNode(6)));

        System.out.println(AddTwoNumbers.addTwoNumbers(l1,l2));

    }
}