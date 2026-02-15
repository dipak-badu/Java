// class First extends Thread{
//     public void run(){
//         for(int i = 1; i<=10; i++){
//             try{
//                 System.out.println(i);
//                 // Thread.sleep(500);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
                
//             }
//         }
//     }
// }

// class Second extends Thread{
//     public void run(){
//         for(int i= 11; i<=20; i++){
//             try{
//                System.out.println(i);
//                 // Thread.sleep(1000);  
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
// }
// }

// public class MultiThread {

//     public static void main(String[] args){
//         Thread first = new First();
//         Thread second = new Second();
//         // first.start();
//         // second.start();
//     }
// }


class First extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            
                System.out.println(i);
                // Thread.sleep(500);

        }
    }
}

class Second extends Thread{
    public void run(){
        for(int i= 11; i<=20; i++){
            
               System.out.println(i);
                // Thread.sleep(1000);  
    
        }
}
}

public class MultiThread {

    public static void main(String[] args){
        Thread first = new First();
        Thread second = new Second();
        

        // priority thread

        first.setPriority(Thread.MAX_PRIORITY);
        second.setPriority(Thread.MIN_PRIORITY);
         first.start();
         second.start();
    }
}