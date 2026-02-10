class Rectangle{
    int length;
    int breadth;

    //paremeterized constructor

    Rectangle(int l, int b){
        length = l;
        breadth = b;

    }

    int calculateArea(){
        return length* breadth;
    }
}

public class Constructor{
    public static void main(String[] args){
        int area;
        Rectangle obj = new Rectangle(20, 40);
        area = obj.calculateArea();

        System.out.println("|The area of recatangle: "+area);
    }
}