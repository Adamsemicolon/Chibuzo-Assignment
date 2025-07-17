import java.util.Scanner;
public class IterationOfLargestAndSecondLargest{
  public static void main(String[]args){
Scanner myscanner = new Scanner(System.in);

System.out.println("Enter number1 ");
int largest = myscanner.nextInt();

int counter = 1;
int secondLargest = 0;

while(counter++ < 5){
System.out.println("Enter number" + counter);
int numbers = myscanner.nextInt();
if(numbers > largest){
secondLargest = largest;
largest = numbers;
}
else if(numbers > secondLargest)secondLargest = numbers;
}
System.out.println("The largest is " + largest + " And the smallest is " + secondLargest);


}
}