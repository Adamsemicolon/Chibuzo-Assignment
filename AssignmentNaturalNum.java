import java.util.Scanner;

public class AssignmentNaturalNum {
public static void main (String[] args) {

Scanner myscanner = new Scanner(System.in);
int counter = 0;
int sum = 0;

while(counter != 10){
System.out.println("Enter natural number: ");
int userInput = myscanner.nextInt();
counter++;

//if(userInput >= 1){
     sum = userInput + sum;
//counter++;
//}

System.out.printf("Sum of natural number is %d%n", sum);
}

}
}