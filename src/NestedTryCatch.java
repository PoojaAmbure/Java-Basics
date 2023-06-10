import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int mks[] = new int[3];
        mks[0] =75;
        mks[1] =85;
        mks[2] =95;
        //mks[3] =65;

        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome to nested try catch");
            try {
                System.out.println(mks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("This Index does not exist..");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
