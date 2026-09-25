

public class NewLinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();

        list.add("Aayan");
        list.add("Malik");
        list.add(0, "Mohd");

        System.out.println("MY NAME " + list);

        
    }
}


//OUTPUT :
// MY NAME [Mohd,Aayan, Malik]
