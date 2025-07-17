import java.util.Scanner; 
public class AdditionRepeatIfUserWants{
  public static void main(String[]args){
Scanner inputReceiver = new Scanner(System.in);

int continueOrQuit;

do{
System.out.println("Enter number ");
int firstNumber = inputReceiver.nextInt();
System.out.println("Enter number ");
int secondNumber = inputReceiver.nextInt();
System.out.println(firstNumber + secondNumber);
System.out.println("To perform the operation again(Input any number) or quit (0) ");
continueOrQuit = inputReceiver.nextInt();
}while(continueOrQuit != 0);












}
}