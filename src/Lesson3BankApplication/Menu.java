package Lesson3BankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Customer customer;
    private final ArrayList<Customer> customerArrayList = new ArrayList<>();
    private String customerPassportName;
    private String customerPassportSurName;
    private String customerPassportMiddleName;
    private String customerPassportId;
    private int customerPassportBirthDate;


    private final Scanner scanner = new Scanner(System.in);

    public void enterMethod() {
        System.out.println("1 - Create Customer");
        System.out.println("2 - Go to Bank");
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> createCustomer();
            case 2 -> bank();
        }
    }

    public void createCustomer() {

        System.out.println("Please wright your name ");
        customerPassportName = scanner.next();
        System.out.println("Please wright your Surname ");
        customerPassportSurName = scanner.next();
        System.out.println("Please wright your Middle name ");
        customerPassportMiddleName = scanner.next();
        System.out.println("Please wright your passport ID (5 numbers) ");
        customerPassportId = scanner.next();
        for (Customer value : customerArrayList) {
            while (customerPassportId.equals(value.getPassport().getId())) {
                System.out.println("wrong ID, there is a customer with tish ID");
                System.out.println("enter correct ID");
                customerPassportId = scanner.next();
            }
        }
        System.out.println("Please wright your date of birth");
        customerPassportBirthDate = scanner.nextInt();
        while (customerPassportBirthDate > 2022 || customerPassportBirthDate < 1900) {
            System.out.println("please enter correct date of birth");
            customerPassportBirthDate = scanner.nextInt();
        }
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
        customerArrayList.add(customer);
        this.customer = customer;
        enterMethod();
    }

    public void bank() {
        System.out.println("Hello wright your passport ID");
        String ID = scanner.next();
        for (int i = 0; i < customerArrayList.size(); i++)  {
            if (ID.equals(customerArrayList.get(i).getPassport().getId())) {
                System.out.println("you are allredy our customer");
                System.out.println(customerArrayList);
            } else {
                System.out.println("you are not our customer");
                System.out.println(customerArrayList);
                createCustomer();
            }
            i = customerArrayList.size();
        }
        Bank bank = new Bank();
        System.out.println("1. BusinessLoan\n2. CustomerLoan ");
        int num = scanner.nextInt();

        switch (num){
            case 1: bank.businessLoanMethod(customer, customerArrayList);
            enterMethod();
            case 2: bank.customerLoanMethod(customer, customerArrayList);
            enterMethod();
        }
    }
}
