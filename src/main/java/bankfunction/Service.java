package bankfunction;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service {
    private HashMap<Integer, Bankfunction> user = new HashMap<>();
    protected Scanner sc = new Scanner(System.in);
    protected Logger bn = Logger.getLogger("tringapps bank");
    private int accNumber;
    private Bankfunction acc;
    private String eror="Invalid account number";

    protected void  newAccount(){
        bn.info("enter your name : ");
        String name = sc.next();
        bn.info("Enter account number : ");
        int accountNumber = sc.nextInt();
        bn.info("Enter initial amount please : ");
        int balance = sc.nextInt();
        acc = new Bankfunction(name, accountNumber, balance);
        user.put(accountNumber, acc);
        if(user.isEmpty()){
            bn.info("no account create");
        }
        else {
            bn.info("Account created successfully.");
        }
    }
    protected void deposit()
    {
        bn.info("enter your account number to depoist:");
        accNumber=sc.nextInt();
        if(user.containsKey(accNumber)){
            bn.info("enter the amount to be deposited:");
            int amount=sc.nextInt();
            acc.S_deposit(amount);
            bn.info("transaction successfull");
        }
        else{
            bn.info(eror);
        }

    }
    protected void  withdraw()
    {
        bn.info("enter your account number to withdraw :");
        accNumber=sc.nextInt();
        if(user.containsKey(accNumber)){
            bn.info("enter the amount to be withdraw :");
            int amount=sc.nextInt();
            acc.S_withdraw(amount);
            bn.info("transaction successfull");
        }
        else{
            bn.info(eror);
        }
    }
    protected void  check() {
        bn.info("Enter Account Number : ");
        accNumber = sc.nextInt();

        if (user.containsKey(accNumber)) {
            Bankfunction display = user.get(accNumber);
            bn.info("Account Holder Name : " + display.getName());
            bn.info("Account Number : " + display.getAccountNumber());
            bn.info("Current balance : " + display.getBalance());
        }
        else{
            bn.info(eror);
        }

    }

    protected void  display()
    {
        if(user.isEmpty()){
            bn.info("no account are there");
        }
        else{
            bn.log(Level.INFO, () -> "the acount are" + user);
        }
    }

}
