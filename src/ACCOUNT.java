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

    }


}
