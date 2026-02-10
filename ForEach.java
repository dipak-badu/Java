// Calculte the sum of an array using for-each loop

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args){
        
       
       try( Scanner sc = new Scanner(System.in)){
         int n, sum=0;
System.out.println("Enter the size of array");

        n = sc.nextInt();
        int [] numbers = new int[n];
        System.out.println("Enter the array element");
        for(int i=0; i<n; i++ ){
          numbers[i] = sc.nextInt();
        }
           
        //calculating sum

        for(int num : numbers){
            sum += num;
        }
         
        System.out.println("Sum of given array :" +sum);
       }
        

    }
}
