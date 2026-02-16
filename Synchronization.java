class PrintTable{
    public synchronized void printTable(int n){
        System.out.println("Table of "+n);
        for(int i= 1; i<=10; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

 class Thread1 extends Thread{
    PrintTable pt;
Thread1(PrintTable pt){
    this.pt = pt;
}
public void run(){
    pt.printTable(2);
}

 }

 class Thread2 extends Thread{
    PrintTable pt;
    Thread2(PrintTable pt){
        this.pt = pt;
    }
    public void run(){
        pt.printTable(5);
    }
 }

 public class Synchronization {
 
    public static void main(String[] args){
        PrintTable obj = new PrintTable();

        //creating thread
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
        
 }
    }