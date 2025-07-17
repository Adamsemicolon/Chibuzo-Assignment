import java.util.Scanner;

public class UserGuessRandom {
public static void main(String[] args) {

Scanner myscanner = new Scanner (System.in);

int coinFlip = (int)(Math.random()*2);
System.out.print("Guess the flip of a coin if it is head or tail using 0 and 1: ");
int userCoinFlip = myscanner.nextInt();

if(coinFlip == userCoinFlip && userCoinFlip == 0 ){
   System.out.print("Head, Guess is correct"); 
}
else if(coinFlip == userCoinFlip && userCoinFlip == 1 ){
   System.out.print("Tails, Guess is correct");
}
else{
   System.out.print("Guess is incorrect");
}

}
}