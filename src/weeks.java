import java.util.*;

public class weeks {
    public static void main(String[] args) {
        //int day =2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num from 1-7 = ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wenesday");
                break;
                case 5:
                System.out.println("thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Satday");
                break;
                default:
                    System.out.println("Does not Exist");
        }
    }

}
