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

  
    // Delete the Node Value 

    public void deleteByValue(int value) {
         if (head == null) {
        return;
    }

    if (head.data == value) {
        head = head.next;
        return;
    }

    Node temp = head;

    while (temp.next != null) {

        if (temp.next.data == value) {
            temp.next = temp.next.next;
            return;
        }

        temp = temp.next;
    }
 }
   

public class MainList
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert_at_Last(10);
        list.insert_at_Last(44);
        list.insert_at_Last(87);
        list.insert_at_Last(23);
        list.insert_at_Last(64);
        list.insert_at_Last(53);

        list.deleteByValue(87);

        list.print();

    
    }
}


//OUTPUT :
// 10, 44, 64, 53
