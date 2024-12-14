import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IndianBank bank = new IndianBank();

        System.out.println("Enter Account Number: ");
        bank.setAcnum(sc.nextLong());
        sc.nextLine();

        System.out.println("Enter name: ");
        bank.setName(sc.nextLine());

        boolean isTrue = true;

        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();


        while (isTrue) {
            if (pin == bank.getPin()) {
                System.out.println("Total Amount: " + bank.getBalance());
                System.out.println("Enter your decision: \n1 for deposit\n2 for withdraw\n0 for exit");

                int decision = sc.nextInt();


                if (decision == 1) {
                    System.out.println("Enter your amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    bank.setBalance(bank.getBalance() + depositAmount);
                    System.out.println("Your current balance is: " + bank.getBalance());


                }
                else if (decision == 2) {
                    System.out.println("Enter the pin number: ");
                    int pin1=sc.nextInt();
                    sc.nextLine();
                if(pin1==pin) {

                        System.out.println("Enter your amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();

                        if (withdrawAmount <= bank.getBalance()) {
                            bank.setBalance(bank.getBalance() - withdrawAmount);
                            System.out.println("You have successfully withdrawn. Your current balance is: " + bank.getBalance());
                        } else {
                            System.out.println("Insufficient funds. Withdrawal failed.");
                        }
                    }else {
                        System.out.println("Enter correct pin");

                    }

                } else if (decision == 0) {
                    isTrue = false;
                    System.out.println("Thank you for using IndianBank!");
                    System.out.println("your Account number is: "+bank.getAcnum());
                    System.out.println("your balance is: "+bank.getBalance());
                    System.out.println("Account Holder Name:  "+bank.getName());



                } else {
                    System.out.println("Invalid choice! Please select 1 for deposit, 2 for withdraw, or 0 for exit.");
                }

            } else {
                System.out.println("Incorrect PIN. Please try again.");
                pin = sc.nextInt();
            }
        }


    }
}
