import java.util.*;
public class Link {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the link : ");
        String sr= sc.next();

        if(sr.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(sr.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(sr.endsWith(".in")){
            System.out.println("This is an Indian website");

        }
        }
    }