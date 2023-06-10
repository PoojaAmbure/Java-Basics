import java.util.Scanner;

class MyExcept extends Exception{
 public String toString(){
     return super.toString() + "I am toString()";
 }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am getMessage()";
    }
}


public class ExceptClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <9) {
            try {
                //throw new MyExcept();
                throw new ArithmeticException("This is a Arithmatic Exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            }
        }
    }
}
