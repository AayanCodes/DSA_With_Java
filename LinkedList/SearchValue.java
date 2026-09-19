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

    // Find the length of the linked list 

    public int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    //Search Linked List

    public boolean search(int target) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == target) {
                return true;
            }

            temp = temp.next;
        }
        return false;
    }

    public void print()
    {
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }
    
}
// Main Class of the Linked List 

public class SearchValue
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i<= 100; i++)
        {
            list.insert_at_Last(i);

        }
        int target = 50;

        if (list.search(target)) {
            System.out.println(target + " is found") ;

        } else {
            System.out.println(target + " is not found");

        }

    }
}


// OUTPUT :
// 50 is found
