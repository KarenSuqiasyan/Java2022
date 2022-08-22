package Lesson3BankApplication;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Customer {

    private Passport passport;
    private int salary;

    ArrayList<Loan> loanArrayList = new ArrayList<>();

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    Random random = new Random();

    @Override
    public String toString() {
        return "Customer{" +
                "passport=" + passport +
                ", salary=" + salary + " AMD" +
                ", loanArrayList=" + loanArrayList +
                ", score=" + score +
                '}';
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<Loan> getLoanArrayList() {
        return loanArrayList;
    }

    public void setLoanArrayList(ArrayList<Loan> loanArrayList) {
        this.loanArrayList = loanArrayList;
    }

    public int salaryGenerator() {
        salary = random.nextInt(1000000) + 65000;
        return salary;
    }


}
