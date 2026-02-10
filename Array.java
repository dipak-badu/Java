import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        int n , sum =0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no element ypou want in array");
        n = sc.nextInt();
        int[] a = new int[n];
         System.out.println("Enter the array element");
         for(int i=0; i<n; i++){
         a[i] = sc.nextInt();
         sum += a[i];
         }

         System.out.println("The given array is :");
         for(int i=0; i<n; i++){
            System.out.println(a[i]);
         }
         System.out.println(sum);


    }
}
