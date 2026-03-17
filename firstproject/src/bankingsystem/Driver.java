package bankingsystem;

import java.util.*;

public class Driver {

    static ArrayList<Bank> accounts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int member;
        do {
            System.out.println("\nWelcome to Akash Banking System");
            System.out.println("1. New User");
            System.out.println("2. Existing User");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            member = sc.nextInt();

            switch (member) {
                case 1:
                    System.out.println("Do you want to create your account?");
                    System.out.println("Press 'y' for yes and 'n' for no");
                    char newregistration = sc.next().charAt(0);

                    if (newregistration == 'y') {
                        System.out.print("Enter your name: ");
                        String name = sc.next();
                        System.out.println("Select account type");
                        System.out.println("1. Current Account");
                        System.out.println("2. Saving Account");
                        int acctype = sc.nextInt();

                        System.out.print("Enter initial balance: ");
                        double bal = sc.nextDouble();

                        try {
                            Bank acc;
                            if (acctype == 1) {
                                acc = new CurrentAccount(name, 'C', bal);
                            } else {
                                acc = new SavingAcc(name, 'S', bal);
                            }

                            accounts.add(acc);
                            System.out.println("Account successfully created");

                        } catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    long accNo = sc.nextLong();
                    System.out.print("Enter password: ");
                    long pass = sc.nextLong();
                    Bank user = null;

                    for (Bank b : accounts) {
                        if (b.getAccNumber() == accNo) {
                            user = b;
                            break;
                        }
                    }

                    if (user == null) {
                        System.out.println("Account not found");
                        break;
                    }

                    if (!user.verifyPassword(pass)) {
                        System.out.println("Wrong password");
                        break;
                    }

                    int choice;
                    do {
                        System.out.println("\n1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Logout");
                        System.out.print("Enter choice: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Current Balance: " + user.getBalance());
                                break;
                            case 2:
                                System.out.print("Enter deposit amount: ");
                                double dep = sc.nextDouble();
                                try {
                                    user.deposit(dep);
                                } catch (InvalidAmountException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 3:
                                System.out.print("Enter withdrawal amount: ");
                                double wd = sc.nextDouble();
                                try {
                                    user.withdraw(wd, pass, "User withdrawal");
                                } 
                                catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                                catch (InsufficientBalanceException e) {
                                    System.out.println(e.getMessage());
                                } catch (Exception e) {
									System.out.println(e.getMessage());
								}
                                break;

                            case 4:
                                System.out.println("Logged out successfully");
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                    } while (choice != 4); 
                    break;

                case 3:
                    System.out.println("Thank you for using Akash Banking System");
                    break;

                default:
                    System.out.println("Invalid selection");
            }

        } while (member != 3);

        sc.close();
    }
}
