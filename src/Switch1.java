import java.util.*;

public class Switch1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur age=");
        int age= sc .nextInt();

        //to make 1 choice
        switch (age){
            case 18:
                System.out.println("U are going to become an adult");
                break;

            case 21:
                System.out.println("U r going to vote now");

            case 60:
                System.out.println("U are going to get retired");
                break;

                default:
                    System.out.println("Enjoy ur life");
        }
    }
}
