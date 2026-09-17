class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedType {
    Node head;
    public void insert(int data)
    {
        Node a = new Node(data);
        if(head == null)
        {
        head = a;
        return;
    }
    Node temp = head;
    while (temp.next != null){
        temp = temp.next;
    }
    temp.next = a;
  }
  public void print()
  {
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp=temp.next;
    }

  }
}

public class LinkedList {
    public static void main(String[] args) {

        LinkedType list = new LinkedType();
        for(int i = 10; i <= 100; i+=10){
            list.insert(i);
        }


        //print the value 
        list.print();



    }
}


// 1o 20 30 40 50 60 70 80 90 100
