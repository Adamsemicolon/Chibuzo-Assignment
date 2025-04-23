import java.util.Scanner;

public class AssignmentPrimeB2 {
public static void main(String[] args) {

Scanner myscanner = new Scanner(System.in);
int counter = 0;

while(counter == 0){
System.out.println("Enter a positive integer: ");
int userInput = myscanner.nextInt();
counter++;

if(userInput <= 1){
System.out.print("It is not a prime number");
break;
}
if(userInput == 2){
System.out.print("It is the lowest prime");
break;
}
if(userInput % 2 == 0 || userInput % 2 < 1){
System.out.println(" It is not a prime number");
}
else{
System.out.println("It is a prime number");
}

}


}
}

