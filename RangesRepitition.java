public class RangesRepitition{
 public static void main(String [] args){
int[] numbers = {54, 2, 15, 98, 76};

int largest = numbers[3];
int smallest = numbers[2];

for(int i = 0; i < 5;i++){
if(numbers[i] > largest)largest = numbers[i];
else if(numbers[i] < smallest)smallest = numbers[i];
}
int result = largest - smallest;
System.out.println(result);


}
}