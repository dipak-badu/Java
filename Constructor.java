class Rectangle{
    int length;
    int breadth;

    //paremeterized constructor

    Rectangle(int l, int b){
        length = l;
        breadth = b;

    }

    // default constructor

    Rectangle(){
      length =60;
      breadth =50;  
    }

    int calculateArea(){
        return length* breadth;
    }
}

public class Constructor{
    public static void main(String[] args){
        int area1 , area2;
        Rectangle obj = new Rectangle(20, 40);
        area1 = obj.calculateArea(); // parameterized constructor

        System.out.println("|The area of recatangle: "+area1);

        Rectangle obj1= new Rectangle();
        area2 = obj1.calculateArea(); // default constructor 
        System.out.println("|The area of recatangle: "+area2);

        

        
    }
}