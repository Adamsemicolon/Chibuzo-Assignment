import java.util.Scanner;
import java.util.Random;

public class MysteryGame3 {
public static void main(String[] args) {

Scanner myscanner = new Scanner(System.in);
Random myrandom = new Random();
int counter = 0;

while(counter != 20){
System.out.println("Guess the number: ");
int userInput = myscanner.nextInt();
int computerChoice = myrandom.nextInt(11);

if(userInput > computerChoice){
System.out.println("Too high");
}
counter++;
if(userInput < computerChoice){
System.out.println("Too low");
}
if(counter % 3 == 0){
computerChoice = myrandom.nextInt(11);
System.out.println("Mystery number has changed");
}
if(userInput == computerChoice){
System.out.println("Congratulation");

System.out.printf("The number of guesses%d%n", counter);
break;
}
System.out.printf("The number of guesses%d%n", counter);
}

}
}