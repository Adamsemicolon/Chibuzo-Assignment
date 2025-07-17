import java.util.Scanner;
public class UserLargestAndSmallest{
 public static void main(String[]args){

Scanner inputReceiver = new Scanner (System.in);

int number = inputReceiver.nextInt();
int largest = number;
int smallest = number;
int counter = 1;

while(counter++ < 5){
number = inputReceiver.nextInt();
if(number > largest) largest = number;
if(number < smallest) smallest = number; 
}

System.out.println("The largest is "+ largest + "and the lowest is "+ smallest );

}
}