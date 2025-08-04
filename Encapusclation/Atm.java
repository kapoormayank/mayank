import java.util.Scanner;
public class Atm {
    String username;
    private int balance;
    private int pin;
    Atm(String username,int balance,int pin)
    {
        this.balance = balance;
        this.pin = pin;
    }

    //User wants to deposit the money in the bank
    
    public void deposit(int amount)
    {
        this.balance = this.balance + amount;
        System.out.println("Sucessfully deposit the money");
        System.out.println("Balance : "+this.balance);
    }

    //User wants to withdrawl the money from the bank

    public void withdrawl(int pin,int amount)
    {
        if(this.pin == pin)
        {
            if(amount <= this.balance)
            {
                this.balance = this.balance - amount;
                System.out.println("Sucessfully withdrawl the money");
                System.out.println("Balance : "+this.balance);
            }
            else{
                System.out.println("Insufficent balance in your account");
            }
        }
        else{
            System.out.println("Wrong pin");
        }
    }

    //User wants to check the balance 
    
    public void balance(int pin)
    {
        if(this.pin == pin)
        {
            System.out.println("Balance : "+this.balance);
        }
        else{
            System.out.println("Wrong pin");
        }
    }

    //User wants to change the pin

    Scanner sc = new Scanner(System.in);
    public void changepin(int pin)
    {
        if(this.pin == pin)
        {
            System.out.print("Enter new pin : ");
            this.pin = sc.nextInt();
            int k =0,r=0;
            if(this.pin != 0)
            {
                r = this.pin % 10 ;
                k++;
            }
            if(k == 4)
            {
                System.out.println("Sucessfully generate the new pin");
            }
            else{
                System.out.println("Pin can stored only four digits number");
            }
            
        }
        else{
            System.out.println("Wrong pin");
        }
    }
    
    //User wants to show the newest pin

    public void newpin(int pin)
    {
        System.out.println("Newest pin : "+this.pin);
        System.out.println("\n");
    }
}
