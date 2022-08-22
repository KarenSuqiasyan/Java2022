package Lesson3BankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private Loan loan;
    private Acra acra = new Acra();
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Customer> customerArrayList = new ArrayList<>();

    private String customerPassportName;
    private String customerPassportSurName;
    private String customerPassportMiddleName;
    private String customerPassportId;
    private int customerPassportBirthDate;

    public void customerInformation() {
        System.out.println(" ");
        System.out.println("Welcome to Bank please wright your name ");
        customerPassportName = scanner.next();
        System.out.println("Please wright your Surname ");
        customerPassportSurName = scanner.next();
        System.out.println("Please wright your Middle name ");
        customerPassportMiddleName = scanner.next();
        System.out.println("Please wright your passport ID (5 numbers) ");
        customerPassportId = scanner.next();
        for (Customer value : customerArrayList) {
            if (customerPassportId.equals(value.getPassport().getId())) {
                System.out.println("you are already our client");
                System.out.println("1. BusinessLoan\n2. CustomerLoan ");
                int num = scanner.nextInt();

                switch (num) {
                    case 1 -> businessLoanMethod(value, customerArrayList);
                    case 2 -> customerLoanMethod(value, customerArrayList);
                }
            }
        }
        System.out.println("Please wright your date of birth");
        customerPassportBirthDate = scanner.nextInt();
        while (customerPassportBirthDate > 2022 || customerPassportBirthDate < 1900) {
            System.out.println("please enter correct date of birth");
            customerPassportBirthDate = scanner.nextInt();
        }
        Customer customer = this.customerGenerator();
        customerArrayList.add(customer);

        System.out.println("1. BusinessLoan\n2. CustomerLoan ");
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> businessLoanMethod(customer, customerArrayList);
            case 2 -> customerLoanMethod(customer, customerArrayList);
        }
    }

    public void customerLoanMethod(Customer customer, ArrayList<Customer> customerArrayList) {

        int score = acra.scoreCounterMethod(customer);
        customer.setScore(score);
        if (acra.isBlocked()) {
            System.out.println("You are blocked and you can`t take a loan from our bank ");

        } else if (score < 400) {
            System.out.println("Your score is too small you can`t take a loan from our bank");
        } else if (customer.getPassport().getBirthDate() > 2004) {
            System.out.println("you are not 18+ you can`t take a loan from our bank");
        } else if (score > 400 && score < 500) {
            loan = new Loan();
            loan.setLoanPercent(12);
            loan.setLoanSum(customer.getSalary() * 2);
            loan.setLoanTypesEnum(LoanTypesEnum.CUSTOMER);
            loan.setTimeLimit(3);
            System.out.println("congratulations u get loan " + loan.getLoanSum() + " AMD");
            System.out.println("enter what day u want to pay your loan");
            int payDay = scanner.nextInt();
            loan.setPayDay(payDay);
            customer.loanArrayList.add(loan);
            for (Customer value : customerArrayList) {
                System.out.println(value);
                for (int i = 0; i < value.getLoanArrayList().size(); i++) {
                    value.getLoanArrayList().get(i).LoanGraphicMethod(value.loanArrayList.get(i).getLoanSum(), value.loanArrayList.get(i).getLoanPercent(), value.loanArrayList.get(i).getTimeLimit(), value.loanArrayList.get(i).getPayDay());

                }
            }
//            loan.LoanGraphicMethod(loan.getLoanSum(), loan.getLoanPercent(), loan.getTimeLimit(), loan.getPayDay());

        } else if (score > 500 && score < 700) {
            loan = new Loan();
            loan.setLoanPercent(12);
            loan.setLoanSum(customer.getSalary() * 5);
            loan.setLoanTypesEnum(LoanTypesEnum.CUSTOMER);
            loan.setTimeLimit(5);
            System.out.println("congratulations u get loan " + loan.getLoanSum() + " AMD");
            System.out.println("enter what day u want to pay your loan");
            int payDay = scanner.nextInt();
            loan.setPayDay(payDay);
            customer.loanArrayList.add(loan);
            for (Customer value : customerArrayList) {
                System.out.println(value);
                for (int i = 0; i < value.getLoanArrayList().size(); i++) {
                    value.getLoanArrayList().get(i).LoanGraphicMethod(value.loanArrayList.get(i).getLoanSum(), value.loanArrayList.get(i).getLoanPercent(), value.loanArrayList.get(i).getTimeLimit(), value.loanArrayList.get(i).getPayDay());
                }

            }
//            loan.LoanGraphicMethod(loan.getLoanSum(), loan.getLoanPercent(), loan.getTimeLimit(), loan.getPayDay());

        } else if (score > 700) {
            loan = new Loan();
            loan.setLoanPercent(12);
            loan.setLoanSum(customer.getSalary() * 10);
            loan.setLoanTypesEnum(LoanTypesEnum.CUSTOMER);
            loan.setTimeLimit(10);
            System.out.println("congratulations u get loan " + loan.getLoanSum() + " AMD");
            System.out.println("enter what day u want to pay your loan");
            int payDay = scanner.nextInt();
            loan.setPayDay(payDay);
            customer.loanArrayList.add(loan);
            for (Customer value : customerArrayList) {
                System.out.println(value);
                for (int i = 0; i < value.getLoanArrayList().size(); i++) {
                    value.getLoanArrayList().get(i).LoanGraphicMethod(value.loanArrayList.get(i).getLoanSum(), value.loanArrayList.get(i).getLoanPercent(), value.loanArrayList.get(i).getTimeLimit(), value.loanArrayList.get(i).getPayDay());
                }

            }
//            loan.LoanGraphicMethod(loan.getLoanSum(), loan.getLoanPercent(), loan.getTimeLimit(), loan.getPayDay());
        }
//        customerInformation();
    }

    public void businessLoanMethod(Customer customer, ArrayList<Customer> customerArrayList) {
        int score = acra.scoreCounterMethod(customer);
        customer.setScore(score);
        if (acra.isBlocked()) {
            System.out.println("You are blocked and you can`t take a loan from our bank ");
        } else if (score < 400) {
            System.out.println("Your score is too small you can`t take a loan from our bank");
        } else if (customer.getPassport().getBirthDate() > 2004) {
            System.out.println("you are not 18+ you can`t take a loan from our bank");
        } else if (score > 400 && score < 500) {
            loan = new Loan();
            loan.setLoanPercent(12);
            loan.setLoanSum((customer.getSalary() * 2) / 480);
            loan.setLoanTypesEnum(LoanTypesEnum.BUSINESS);
            loan.setTimeLimit(3);
            System.out.println("congratulations u get loan " + loan.getLoanSum() + " USD");
            System.out.println("enter what day u want to pay your loan");
            int payDay = scanner.nextInt();
            loan.setPayDay(payDay);
            customer.loanArrayList.add(loan);
            for (Customer value : customerArrayList) {
                System.out.println(value);
                for (int i = 0; i < value.getLoanArrayList().size(); i++) {
                    System.out.println("Loan Sum - " + value.getLoanArrayList().get(i).getLoanSum()
                            + " Loan percent - " + value.getLoanArrayList().get(i).getLoanPercent()
                            + " Loan PayLimit - " + value.getLoanArrayList().get(i).getTimeLimit());
                    value.getLoanArrayList().get(i).LoanGraphicMethod(value.loanArrayList.get(i).getLoanSum(), value.loanArrayList.get(i).getLoanPercent(), value.loanArrayList.get(i).getTimeLimit(), value.loanArrayList.get(i).getPayDay());
                    System.out.println(" ");
                }

            }
            //            loan.LoanGraphicMethod(loan.getLoanSum(), loan.getLoanPercent(), loan.getTimeLimit(), loan.getPayDay());
        } else if (score > 500 && score < 700) {
            loan = new Loan();
            loan.setLoanPercent(12);
            loan.setLoanSum((customer.getSalary() * 5) / 480);
            loan.setLoanTypesEnum(LoanTypesEnum.BUSINESS);
            loan.setTimeLimit(5);
            System.out.println("congratulations u get loan " + loan.getLoanSum() + " USD");
            System.out.println("enter what day u want to pay your loan");
            int payDay = scanner.nextInt();
            loan.setPayDay(payDay);
            customer.loanArrayList.add(loan);
            for (Customer value : customerArrayList) {
                System.out.println(value);
                for (int i = 0; i < value.getLoanArrayList().size(); i++) {
                    System.out.println("Loan Sum - " + value.getLoanArrayList().get(i).getLoanSum()
                            + " Loan percent - " + value.getLoanArrayList().get(i).getLoanPercent()
                            + " Loan PayLimit - " + value.getLoanArrayList().get(i).getTimeLimit());
                    value.getLoanArrayList().get(i).LoanGraphicMethod(value.loanArrayList.get(i).getLoanSum(), value.loanArrayList.get(i).getLoanPercent(), value.loanArrayList.get(i).getTimeLimit(), value.loanArrayList.get(i).getPayDay());
                    System.out.println(" ");

                }

            }
            //           loan.LoanGraphicMethod(loan.getLoanSum(), loan.getLoanPercent(), loan.getTimeLimit(), loan.getPayDay());

        } else if (score > 700) {
            loan = new Loan();
            loan.setLoanPercent(12);
            loan.setLoanSum((customer.getSalary() * 2) / 480);
            loan.setLoanTypesEnum(LoanTypesEnum.BUSINESS);
            loan.setTimeLimit(10);
            System.out.println("congratulations u get loan " + loan.getLoanSum() + " USD");
            System.out.println("enter what day u want to pay your loan");
            int payDay = scanner.nextInt();
            loan.setPayDay(payDay);
            customer.loanArrayList.add(loan);

            for (Customer value : customerArrayList) {
                System.out.println(value);
                for (int i = 0; i < value.getLoanArrayList().size(); i++) {
                    System.out.println("Loan Sum - " + value.getLoanArrayList().get(i).getLoanSum()
                            + " Loan percent - " + value.getLoanArrayList().get(i).getLoanPercent()
                            + " Loan PayLimit - " + value.getLoanArrayList().get(i).getTimeLimit());
                    value.getLoanArrayList().get(i).LoanGraphicMethod(value.loanArrayList.get(i).getLoanSum(), value.loanArrayList.get(i).getLoanPercent(), value.loanArrayList.get(i).getTimeLimit(), value.loanArrayList.get(i).getPayDay());
                    System.out.println(" ");
                }

            }
            //    loan.LoanGraphicMethod(loan.getLoanSum(), loan.getLoanPercent(), loan.getTimeLimit(), loan.getPayDay());
        }
  //      customerInformation();
    }

    public Customer customerGenerator() {
        Passport passport = new Passport.Builder()
                .setBirthDate(customerPassportBirthDate)
                .setId(customerPassportId)
                .setName(customerPassportName)
                .setSurName(customerPassportSurName)
                .setMiddleName(customerPassportMiddleName)
                .build();
        Customer customer = new Customer();
        customer.setPassport(passport);
        customer.setSalary(customer.salaryGenerator());
        return customer;
    }

    public enum LoanTypesEnum {
        BUSINESS {
            public int USD(int x) {
                return x / 430;
            }
        },
        CUSTOMER
    }

}

