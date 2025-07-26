public class bankTransaction {
    public static void main(String[] args) {
        int choice = 2;
        int balance = 10000;
        int amount = 3000;
        String receiverAcc = "chaithu";
        switch(choice){
            case 1: 
                if(balance >= amount && amount > 0){
                    balance -= amount;
                    System.out.println(amount);
                }else{
                    System.out.println("insufficient funds");
                }
        break;
        case 2: 
             if(amount > 0){
            balance += amount;
            System.out.println(amount);
        }else{
            System.out.println("invalid deposit");
        }
        break;
         case 3:
            if (amount <= balance && receiverAcc!= null ) {
                    balance -= amount;
                    System.out.println( amount);

                } else {
                    System.out.println("Transfer failed. Check balance or receiver account.");
                }
                break;
            default : System.out.println("invalid choice");
    }
    System.out.println(balance);
}
}