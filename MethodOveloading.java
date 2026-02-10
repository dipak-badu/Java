class Sum {

   int sum(int a, int b){
        return (a+b);
    }
    int sum(int a , int b, int c){
        return (a+b+c);
    }

    double sum( double x , double y){
        return (x+y);
    }
    
}


public class MethodOveloading{
    public static void main(String[] args){
       Sum s = new Sum();
       System.out.println("Sum = "+s.sum(2,4));
       System.out.println("Sum = "+s.sum(2,4, 8));
       System.out.println("Sum = "+s.sum(2.5,4.0));
    }
}

