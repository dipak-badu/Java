import java.util.Scanner;
public class AddNum{
public static void main(String [] args){
   int num1, num2, sum ;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   num1 = sc.nextInt();
    System.out.println("Enter second number");

    num2= sc.nextInt();
     
    sum = num1+num2;

    System.out.println("Sum of the these number:" +sum);
    sc.close();


} 
}


