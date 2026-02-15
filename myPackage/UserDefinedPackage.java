package myPackage; // this is user defined package
 class Add{
public int add(int x, int y){
    return (x+y);
} 
    
}


public class UserDefinedPackage {

    public static void main(String[] args){
        Add obj = new Add();
        System.out.println("Sum = "+obj.add(40,60));
    }
}