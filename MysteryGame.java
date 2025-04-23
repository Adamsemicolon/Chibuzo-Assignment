import java.util.Scanner;
import java.util.Random;

public class MysteryGame {
public static void main(String[] args) {

Scanner myscanner = new Scanner(System.in);
Random myrandom = new Random();
int counter = 0;

while(counter != 3){
System.out.println("Guess a number: ");
int userInput = myscanner.nextInt();
int computerChoice = myrandom.nextInt(11);

if(userInput == computerChoice){
System.out.println("It is Correct");
counter = 3;
}

if(userInput > computerChoice){
System.out.println("Too high, Re-enter");
counter = counter + 1;
}

if(userInput < computerChoice){
System.out.println("Too low, Re-enter");
counter = counter + 1;
}

}

}
}
