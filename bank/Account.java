package bank;

import java.util.Scanner;




    public class Account extends Bank{
        private double balance = 12231d;
        Scanner scan = new Scanner(System.in);

        @Override
        public Double viewBalance() {
            System.out.println("\nYour balance is: => " + balance);
            return this.balance;
        }

        @Override
        public void withdraw() {
            System.out.println("how much do you want to withdraw");
            var with = scan.nextFloat();
            if (with > this.balance){
                System.out.println("withdraw amount is about you balance");
                System.out.println("your balance is: => " + balance);
//            return -1.0;
            }
            else {
                int i = 0;
                for (i =0; i < 3; i++){
                    System.out.println("enter your pin\n \t\t you have 3 trials");
                    var pin = scan.nextInt();
                    if (pin == 1234){
                        i = 4;
                        this.balance = this.balance - with;
                        System.out.println("withdraw successful!! \n \n Your new balance is: => " + balance);
                    }
                    else {
                        System.out.println("Pin is incorrect. kindly try again!");
                    }
                }
                System.out.println("wrong pin");
            }
        }



        @Override
        public void deposit() {
            System.out.println("enter deposited amount");
            var depo = scan.nextFloat();
            if (depo == 0 || depo < 0){
                System.out.println("you cannot deposit an amount less than or equal to zero");
            }
            else{
                this.balance = this.balance + depo;
                System.out.println("you deposited " + depo + " into your account \n \nnew balance: =>" + balance);
            }

//        return  amount;
        }


    }


