public class Polynomial{
    // Node class for polynomial terms
    static class Node {
        int val;  // coefficient
        int exp;  // exponent
        Node prev;
        Node next;

        Node(int val, int exp) {
            this.val = val;
            this.exp = exp;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "x^" + temp.exp);
            temp = temp.next;
            if (temp != null)
                System.out.print(" + ");
        }
        System.out.println();
    }

    public static void displayRev(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null)
            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.val + "x^" + temp.exp);
            temp = temp.prev;
            if (temp != null)
                System.out.print(" + ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create nodes for polynomial: 2x^2 + 3x^1 + 4x^0
        Node a = new Node(2, 2);
        Node b = new Node(3, 1);
        Node c = new Node(4, 0);
        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;

        System.out.println("Polynomial in Forward Direction:");
        display(a);

        System.out.println("Polynomial in Reverse Direction:");
        displayRev(a);
    }
}
