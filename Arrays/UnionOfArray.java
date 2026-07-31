import java.util.HashSet;

public class UnionOfArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4,};
        int[] arr2 = {9, 8, 7, 5,};

        HashSet<Integer> set  = new HashSet<>();

        for(int num : arr1) {
            set.add(num);


        }

        for(int num : arr2){
            set.add(num);

        }

        System.out.println("Union = " + set);


    }
}


/*  OUTPUT :
Union = [1, 2, 3, 4, 5, 7, 8, 9]

*/
