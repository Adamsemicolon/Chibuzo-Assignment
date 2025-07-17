import java.util.Scanner;
public class RaiseValue{
  public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

System.out.println("Enter number: ");
int firstNumber = inputReceiver.nextInt();
System.out.println("Enter number: ");
int secondNumber = inputReceiver.nextInt();

int raiseTo = 1;
int counter = 0;
while(counter++ < secondNumber){
raiseTo *= firstNumber;

}

System.out.println(raiseTo);









}
}