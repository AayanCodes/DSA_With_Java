class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;

    }
}
// Create the Linked List 

class LinkedList
{
    Node head;
    public void insert_at_Last(int data)
    {
        Node a = new Node(data);
        if(head == null){
            head = a;
            return;

        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;

        }
        temp.next = a;

    }

    // find the Maxmium element in the Linked List

    public int findMax() {
        if(head == null) {
            return -1; // Linkedlist is Empty
        }

        int max = head.data;
        Node temp = head.next;

        while(temp !=null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;

        }
        return max;
    } 

 
 
// Main Class of the Linked List 

public class MaximumList
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert_at_Last(10);
        list.insert_at_Last(44);
        list.insert_at_Last(87);
        list.insert_at_Last(23);
        list.insert_at_Last(64);
        list.insert_at_Last(53);

        System.out.println("Maximum = " + list.findMax());

}

  //OUTPUT: 
  // Maximum = 87
