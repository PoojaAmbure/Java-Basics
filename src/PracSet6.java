import java.util.*;
import java.util.Random;
// Create a class Game, which allows usr to play "guess the num game once
// game should have the following methods
// 1 Constructor to generate the random methods
// 2 takeUserInput() to take user input of num
// 3 isCorrectNumber() to detect whether the number entered by the number is true
// use numofguesses(int)
// use getter and setter for numofguesses()

class Game{
    public int number ;
    public int Inputnum ;
    public int numofguess;

    public int getNumofguess() {
        return numofguess;
    }
    public void setNumofguess(int numofguess) {
        this.numofguess = numofguess;
    }
     Game(){
        Random ran = new Random();
        this.number =ran.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the Num");
     Scanner sc = new Scanner(System.in);
     Inputnum = sc.nextInt();
    }
    boolean isCorrectNum(){
        if(Inputnum ==number){
            System.out.format("Yes u guessed it right. It was %d .\n u guessed it in %d attempts \n",number , numofguess);
            return true;
        }
        else if (Inputnum < number){
            System.out.println("Tooo loww.....");
        }
        else if (Inputnum > number){
            System.out.println("Tooo high.....");
        }
        return false;
    }
}
public class PracSet6 {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b=false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNum();
            System.out.println(b);
        }
    }
}
