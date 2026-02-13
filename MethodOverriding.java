class Animal{
   protected void eat(){
        System.out.println("Eats milk");
    }
}

class Dog extends 
Animal{
 protected void eat(){ // eat method override the eat method of parent classa 
    super.eat(); // this will call the eat method of parent class
        System.out.println("Eats bones");

}
}
public class MethodOverriding {

    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
    }
}