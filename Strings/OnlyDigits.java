public class OnlyDigits {

    public static void main(String[] args) {

        String str = "123456";

        boolean isDigit = true;

        for(int i = 0; i < str.length(); i++) {

            if(!Character.isDigit(str.charAt(i))) {

                isDigit = false;
                break;

            }
        }

        if(isDigit) {

            System.out.println("String contains only digits.");

        } else {
         
        System.out.println("String does not contain only digits.System.err.println");
    
         } 
  
    }


}

/* OUTPUT :
String contains only digits.

  */
