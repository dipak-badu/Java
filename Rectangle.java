import java.util.Scanner;
 public class Rectangle{
 int l, b;
 void getData(){
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter lenght and breadth");
        l = sc.nextInt();
        b= sc.nextInt();
    }
 }

 void displayData(){
    int a ,p;
    a = l*b;
    p = 2*(l+b); 

    System.out.println("Area of rectangle : "+a);
    System.out.println("Perimeter of rectangle : "+p);
 }
    
 public static void main(String[] args){
    Rectangle obj1 = new Rectangle();
    obj1.getData();
    obj1.displayData();
 }
 }