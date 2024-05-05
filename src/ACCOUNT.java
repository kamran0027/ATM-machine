import java.util.Scanner;

public class ACCOUNT {
    float bal;
     int pin;
    Scanner sc=new Scanner(System.in);

    ACCOUNT(float bal,int pin){
       this.bal=bal;
       this.pin=pin;
   }

    void showbalance(){
        System.out.println("enter pin:");
        int Pin= sc.nextInt();
        if (Pin==this.pin){
            System.out.println("Balance: "+this.bal);
        }
        else {
            System.out.println("wrong pin...");
        }
        menu();

    }

    void Withdraw(){
        System.out.println("enter ammount:");
        float widamt=sc.nextInt();

        System.out.println("enter pin:");
        int Pin= sc.nextInt();

        if (Pin==this.pin){
            if (this.bal>widamt){
                bal-=widamt;
                System.out.println("Withdraw complete..");
            }
            else {
                System.out.println("insuffician balance or wrong pin..");
            }

        }
        menu();
    }

    void deposite(){
        System.out.println("enter pin:");
        int Pin= sc.nextInt();
        if (this.pin==Pin){
            System.out.println("enter ammount:");
            float amt=sc.nextInt();
            this.bal+=amt;
        }
        else{
            System.out.println("wrong pin..");
        }
        menu();

    }
    void menu(){
        System.out.println("enter choice");
        System.out.println("1. show balance ");
        System.out.println("2. withdraw ammount");
        System.out.println("3. deposit money ");
        System.out.println("4. exit");

        int choice=sc.nextInt();

        if (choice==1){
            showbalance();
        }
        else if (choice==2) {
            Withdraw();
        }
        else if (choice==3) {
            deposite();
        }
        else if (choice==4) {
            return;
        }
        else {
            System.out.println("enter valid choice");
        }
    }


}
