import java.util.Scanner;
public class CountsOfZeroPosiNegative{
  public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);
int number;
int counter = 0;
int zeros = 0;
int posithief = 0;
int negative = 0;
while(counter++ < 5){
System.out.print("Enter number ");
number = inputReceiver.nextInt();
if(number == 0) zeros += 1;
if(number > 0) posithief += 1;
if(number < 0) negative += 1;}
System.out.println("The amount of zeros is " + zeros+" and the amount of positve is "+ posithief+" and the amount of negative is "+negative); 







}
}