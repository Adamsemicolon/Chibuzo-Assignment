import java.util.Scanner;
public class FactorialNumberFind{
  public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

System.out.println("Enter number");
int number = inputReceiver.nextInt();
int number1 = 1;
int counter = 1;
while(counter++ < number){ 
number1 *= counter;

}
System.out.println(number1);




}
}