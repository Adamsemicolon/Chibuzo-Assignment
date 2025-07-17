import java.util.Scanner;

public class MultipleOfSixSeven{
public static void main(String[]args){

Scanner myscanner = new Scanner(System.in);

System.out.print("Input an integer: ");
int firstNumber = myscanner.nextInt();

if(firstNumber % 6 == 0||firstNumber % 7 == 0){
 System.out.println("Number is a multiple of six or multiple of seven"); 
}
else{
 System.out.println("Number is not a multiple of six or seven");
}

}
}