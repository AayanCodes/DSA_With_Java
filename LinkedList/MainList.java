// Find the length of the Linnked List.

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;

    }
}

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

    public int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
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


public class MainList
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i<= 100; i++)
        {
            list.insert_at_Last(i);

        }
        // print the LinkedList
        list.print();
        System.out.println("\nlength = " + list.length());

    }
}
