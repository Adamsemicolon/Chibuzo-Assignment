import java.util.Scanner;

public class UserGuessRandom2 {
public static void main(String[] args) {

Scanner myscanner = new Scanner (System.in);

int coinFlip = (int)(Math.random()*2);
System.out.print("Guess the flip of a coin if it is head or tail using 0 and 1: ");
int userCoinFlip = myscanner.nextInt();

if(coinFlip == userCoinFlip){
   System.out.print("Guess is correct"); 
}
else if(userCoinFlip != coinFlip){
   System.out.print("Incorrect, Try Again "); 
   int userCoinFlip2 = myscanner.nextInt();
if(userCoinFlip2 == coinFlip){
   System.out.print("It is correct after your second trial ");
}
else{
   System.out.print("Guess is incorrect again");
}
}

}
}