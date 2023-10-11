import bank.Account;

import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Account account = new Account();
                Account gerald = new Account();

                Scanner scanner = new Scanner(System.in);

                System.out.println();
                System.out.println("select function: \n 1. Deposit \n 2. Withdraw \n 3. View balance");
                var amount = scanner.nextFloat();

                switch ((int) amount){
                    case 1:{
                        System.out.println("choose beneficiary \n 1. gerald \n 2. Account");
                        var bene = scanner.nextInt();
                        if (bene == 1){
                            gerald.deposit();
                        }
                        else {
                            account.deposit();
                        }

                    }
                    break;
                    case 2:{
                        account.withdraw();
                    }
                    break;
                    case 3:{
                        account.viewBalance();
                    }
                    break;
                    default:{
                        System.out.println("wrong parameter entered, try again!!");
                    }
                }
            }
        }


