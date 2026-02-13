// uses interface like class 
//  uses implemnts keyword for implementing(extending interence) 

// interface Person{
//  String person_name = "Dipak badu";
//  int age = 21;
//  public void displayInfo();
// } 

// public class Interface implements Person {
//  public void displayInfo(){
//     System.out.println("Name: "+person_name);
//     System.out.println("Age: "+age);

//  }

//  public static void main(String[] args){
//     Interface info = new Interface();
//     info.displayInfo();
//  }
    
// }


// extended interface 

class A{
    int a =10;
    int add(int y){
        int b =y;
        return a+b;

    }
}

interface B{
    int x= 20;
    void display();
}

class C extends A implements B{
    int mul = a*x;
    int sum = add(30);
    public void display(){
        System.out.println("Sum = "+sum);
        System.out.println("mul = "+mul);
    }

}

public class Interface {

    public static void main(String[] args){
        C obj = new C();
        obj.display();
    }
}