public class KataArray{

public static int isMaximumArray(int[]numbers){
int largest = numbers[0];
for(int value = 1;value < numbers.length;value++){
if(numbers[value] > largest)largest = numbers[value];
}

return largest;
}

public static int isMinimumArray(int[]numbers){
int smallest = numbers[0];
for(int value = 1;value < numbers.length;value++){
if(numbers[value] < smallest)smallest = numbers[value];
}

return smallest;
}

public static int isSumOfArray(int[]numbers){
int sum = 0;
for(int value = 0;value < numbers.length;value++){
sum += numbers[value];
}

return sum;
}

public static int isSumOfEvenNumbersInArray(int[] numbers){
int sumEven = 0;
for(int value = 0;value < numbers.length;value++){
if(numbers[value] % 2 == 0)sumEven += numbers[value];;
}

return sumEven;
}

public static int isSumOfOddNumbersInArray(int[] numbers){
int sumOdd = 0;
for(int value = 0;value < numbers.length;value++){
if(numbers[value] % 2 != 0)sumOdd += numbers[value];
}

return sumOdd;
}

public static int[] isMaximumAndMinimumArray(int[]numbers){
int maximum = numbers[0]; 
int minimum = numbers [0];;

for(int value = 1;value < numbers.length;value++){
if(numbers[value] > maximum)maximum = numbers[value];
if(numbers[value] < minimum)minimum = numbers[value];
}
int [] spare = {maximum, minimum};

return spare;
}

public static int noOfOddNumberInArray(int[]numbers){
int countOdd = 0;
for(int value = 0;value < numbers.length;value++){
if(numbers[value] % 2 != 0)countOdd += 1;
}

return countOdd;
}

public static int noOfEvenNumberInArray(int[]numbers){
int countEven = 0;
for(int value = 0;value < numbers.length;value++){
if(numbers[value] % 2 == 0)countEven += 1;
}

return countEven;
}

public static int[] oddNumbersInArray(int[]numbers){
int countOdd = 0;
int count = 0;
for(int value =0; value < numbers.length;value++){
if(numbers[value] % 2 != 0){
countOdd++;
}
}
int [] spare = new int[countOdd];
for(int value = 0; value < numbers.length;value++){
if(numbers[value] % 2 != 0){
spare[count] = numbers[value];
count++;
}
}

return spare;
}

public static int[] evenNumbersIn(int[]numbers){
int countEven = 0;
int count = 0;
for(int value = 0;value < numbers.length;value++){
if(numbers[value] % 2 == 0){
countEven+=1;
}
}
int [] spare = new int[countEven];
for(int value = 0; value < numbers.length;value++){
if(numbers[value] % 2 == 0){
spare[count] = numbers[value];
count++;
}
}

return spare;
}

public static int[] squareNumbersInArray(int[]numbers){

int isSquare = 0;
int multiply = 1;

for(int value= 0; value < numbers.length; value++){
for(multiply = 1;multiply < numbers[value];multiply++){
if(numbers[value] == multiply * multiply){
isSquare++;}
else if(numbers[value] < multiply)break;
}
}
int[]spare = new int[isSquare];
int count = 0;
for(int value= 0; value < numbers.length; value++){
for(multiply = 1;multiply < numbers[value];multiply++){
if(numbers[value] == multiply * multiply){
spare[count] = numbers[value];
count++;}
else if(numbers[value] < multiply)break;
}
}

return spare;
}







}