public class IterationRaiseToPowerTable{
  public static void main(String[]args){

System.out.println("a \tb \tpow(a, b)");

int counts = 1;
int count = 2;
int counter = 0;
while(counter++ < 5){
System.out.println(counts + "\t" + count + "\t" + (int) Math.pow(counts, count));
counts += 1;
count +=1;}



}
}