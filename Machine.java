package oasisassignment;
import java.util.Scanner;
public class Machine {

    public static void main(String[] args) {
        float balence = 60000;
        int pin;
        int choice;
        int pretransection=0;
        int trail=3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To MyBanking");
        while (trail!=0){
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Enter UserID:");
            int id=sc.nextInt();
            System.out.println("Enter your pin:");

        pin = sc.nextInt();

        if (pin != 7010) {
             System.out.print("\u000C");
            System.out.println("invalid pin");
            trail -= 1;
            System.out.println("Attempts Left:" + trail);
            if(trail==0){
                System.out.println("Operation Terminated");
            }

        }  if (pin==7010) {
                 System.out.print("\u000C");
            do {
                

                
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1.Withdraw Cash\n2.Deposite Cash\n3.Transfer Amount\n4.Previous transaction\n5.Quit");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Enter Choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("\u000C");
                        System.out.println("Your Selected option is: " + "Withdraw Cash");
                        float amount;
                        System.out.println("Enter Amount:");
                        amount = sc.nextFloat();
                        if (amount < balence) {
                            float newbalence = balence - amount;
                            System.out.println("Trasaction Sucessful!!!");
                            System.out.println("Account balence:" + newbalence);
                            pretransection+=1;
                        } else {
                            System.out.println("Insufficient Balence");
                        }
                        break;
                        case 2:
                        System.out.print("\u000C");
                        System.out.println("your selected option is:" + "Deposite cash");
                        float Newamount;
                        System.out.println("Enter Amount:");
                        Newamount = sc.nextFloat();
                        Newamount = balence + Newamount;
                        System.out.println("Cash Deposite Sucessfully!!!");
                        System.out.println("Account Balence:" + Newamount);
                        pretransection+=1;
                        break;

                    case 3:
                        System.out.print("\u000C");
                        System.out.println("your selected Option is:" + "Transfer Amount");
                        int user;
                        System.out.println("Enter Account Number of Receiver:");
                        user = sc.nextInt();
                        //System.out.println("Enter receivers name:");
                        //String Name=sc.nextLine();
                        //System.out.println("receivers Name"+Name);

                        System.out.println("Enter amount:");
                        float Newamount2 = sc.nextFloat();
                        if (balence > Newamount2) {


                            System.out.println("Amount Transfered To Account Number:" + user);
                            System.out.println("Transaction Successful!!!");
                            //System.out.println(Newamount2+"rs Send to"+Name);
                            balence = balence - Newamount2;
                            System.out.println("Account Balence is:" + balence);
                            pretransection+=1;
                        } else {
                            System.out.println("Insuffient Account Balence");
                        }
                        break;


                    case 4:
                        System.out.print("\u000C");
                        System.out.println("you Selected the option:"+"Transaction History");
                        if (pretransection>=1){
                            System.out.println("Previous Transaction :"+pretransection);


                        }
                        else{
                            System.out.println("No Transaction Occured.");
                        }
                        
                    case 5:
                        
                        break;

                    default:
                        System.out.print("\u000C");
                        System.out.println("Invalid Option");


                }

            }while(choice!=5);
            System.out.print("\u000C");
            System.out.println("Happy To help You");
            break;
        }}
    }
}
