package mail.ForwardElements;

/**
 * 단방향 연결 리스트(Singly linked list)가 주어지면 O(n log n) 시간복잡도로 정렬하시오.
 * Given a singly linked list, sort the list in O(n log n) time complexity.
 */
class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}
public class ForwardElements {
    static void insert(Node node, int val){    
        Node n = new Node(val);
        while (node.next != null){
            node = node.next;
        }
        node.next = n;
    }
    static void show(Node node){
        while(node.next != null){
            node = node.next;
            System.out.println(node.value);
        }
    }
    public static void main(String args[]) {
        Node node = new Node(1);
        insert(node, 2);
        insert(node, 3);
        insert(node, 4);
        show(node);

        
    }

}

