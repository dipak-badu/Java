// import javax.print.DocFlavor.STRING;

// public class ExceptionHandling {

//    public static void main(String[] args){
//      try{
//         int[] array = new int[10];
//         array[10]= 30/0;
//         array[20] =50;
        
//     }catch(ArithmeticException e){
//         System.out.println(e.getMessage());
//     }catch(ArrayIndexOutOfBoundsException e){
//         System.out.println(e.getMessage());
        
//     }
//    }
// }


// create custom excewptipn

// class myException extends Exception{
//     myException(String message){
//         super(message);
//     }
// }


// class InsufficicentBalcence extend Exception{
//     // constructor
//     public InsufficicentBalcence(string message){
//         super(message);
//     } 
// }

// class Bank {

//     private int balance;

//     // Constructor
//     public Bank(int balance) {
//         this.balance = balance;
//     }

//     // Withdraw method
//     public void withdraw(int amount) throws InsufficientBalanceException {

//         if (amount > balance) {
//             throw new InsufficientBalanceException("Not enough balance!");
//         }

//         balance -= amount;
//         System.out.println("Withdrawal successful!");
//         System.out.println("Remaining balance: " + balance);
//     }
// }


// public class ExceptionHandling {

//     public static void main(String[] args) {

//         Bank account = new Bank(5000);

//         try {
//             account.withdraw(6000);   // trying to withdraw more than balance
//         } 
//         catch (InsufficientBalanceException e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }

//         System.out.println("Program continues...");
//     }
// }
