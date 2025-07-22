public class Kata {

public static int factorOf(int number){
int count = 0;
int counter = 0;
while(counter++ <= number){
if(number % counter == 0)
count += 1;
}
return count;
}

public static boolean isSquare(int number){
int square = (int)Math.sqrt(number);
if(square * square == number)return true;

return false;
}

public static long squareOf(int number){
number *= number;
return number;
}

public static long factorialOf(int number){
int counter = 1;
int factorial = 1;
while(counter++ < number){
factorial *= counter;
}
return factorial;
}

public static boolean isPalindrome(int number){
int firstNum =  number / 10000;
int secondNum = (number / 1000)% 10;
int thirdNum = (number/ 100) % 10;
int fourthNum = (number % 100)/ 10;
int fifthNum = (number % 1000)% 10;
String addNum = "" + fifthNum + fourthNum + thirdNum + secondNum + firstNum;
int result = Integer.valueOf(addNum);
if(result == number) return true;

return false;
}

public static float divide(int number1, int number2){
if(number2 == 0)return number2;
int result = number1 / number2;
return result; 
}

public static int substract(int number1, int number2){
int result = Math.abs(number1 - number2);
return result;
}

public static boolean isEven(int number){
if(number % 2 == 0)return true;

return false;
}

public static boolean isPrime(int number){
if (number < 0)return false;

int counter = 2;
while(counter * counter <= number){
if(number % counter == 0)return false;
counter++;
}
return true;
}










}