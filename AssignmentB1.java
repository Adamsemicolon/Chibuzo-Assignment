import java.util.Scanner;

public class AssignmentB1 {
public static void main(String[] args){

Scanner myscanner = new Scanner(System.in);
int userInput;
int largest = 0;
int smallest = 0;

userInput = myscanner.nextInt();
int count = 0;

for(int counter= 1; counter <= 3; counter++){
 
if(userInput > largest)largest = userInput;
}
//if(largest < userInput){
//smallest = largest;
//count++;
//}
 
System.out.println("The largest number is" + largest);
System.out.println("The smallestnumber is" + smallest);

}
}