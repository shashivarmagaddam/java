public class Ecom{
 public static void main(String[] args) {
  int category = 1; 
        int days = 6;
        boolean tagAttached = true;
        switch (category) {
            case 1:
                if (days <= 7) {
                    System.out.println("Returns are allowed");
                } else {
                    System.out.println("Returns are not allowed");
                }
                break;
            case 2:
                if (tagAttached) {
                    System.out.println("Returns are allowed");
                } else {
                    System.out.println("Return is denied");
                }
                break;
            case 3:
                System.out.println("Return is denied");
                break;
        }

 }

}
