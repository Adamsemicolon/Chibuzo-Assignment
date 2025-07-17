import java.util.Scanner;
public class GuessRepeatedly{
 public static void main(String[]args){

Scanner inputReceiver = new Scanner (System.in);

int guess = (int) (Math.random()* 20);
while(true){
System.out.print("Guess what the number is ");
int userInput = inputReceiver.nextInt();
if(userInput == guess){
System.out.println("Correct");
break;}
else if(userInput > guess)System.out.println("Too high, try again");
else if(userInput < guess)System.out.println("Too low, try again");





}
}
}