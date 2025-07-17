import java.util.Scanner;
public class RaiseToPower{
  public static void main(String[]args){
Scanner myscanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = myscanner.nextInt();
int number2 = myscanner.nextInt();
int number3 = (int)Math.pow(number, number2);

System.out.println("The result of raise to power 2 is " + number3);
}
}