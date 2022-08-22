package Lesson3BankApplication;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Loan {

    private int loanSum;
    private int loanPercent;
    private int timeLimit;
    private Bank.LoanTypesEnum loanTypesEnum;
    private int payDay;

    @Override
    public String toString() {
        if (loanSum > 65000) {
            return "Loan{" +
                    "loanSum=" + loanSum + " AMD" +
                    ", loanPercent=" + loanPercent +
                    ", timeLimit=" + timeLimit + " month" +
                    ", loanTypesEnum=" + loanTypesEnum +
                    ", payDay=" + payDay +
                    '}';
        } else {
            return "Loan{" +
                    "loanSum=" + loanSum + " USD" +
                    ", loanPercent=" + loanPercent +
                    ", timeLimit=" + timeLimit + " month" +
                    ", loanTypesEnum=" + loanTypesEnum +
                    ", payDay=" + payDay +
                    '}';
        }

    }

    public int getLoanSum() {
        return loanSum;
    }

    public void setLoanSum(int loanSum) {

        this.loanSum = loanSum;

    }

    public int getLoanPercent() {
        return loanPercent;
    }

    public void setLoanPercent(int loanPercent) {
        this.loanPercent = loanPercent;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Bank.LoanTypesEnum getLoanTypesEnum() {
        return loanTypesEnum;
    }

    public void setLoanTypesEnum(Bank.LoanTypesEnum loanTypesEnum) {
        this.loanTypesEnum = loanTypesEnum;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public void LoanGraphicMethod(int loanSum, int loanPercent, int timeLimit, int payDay) {

        int mnacord;
        int tokos;
        int mayrgumar;
        int month = 6;
        mayrgumar = loanSum / timeLimit;
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DATE, payDay);

        for (int i = 0; i < timeLimit; i++) {

            calendar.add(Calendar.MONTH, 1);

            mnacord = loanSum - mayrgumar;
            tokos = (mnacord) * loanPercent / 100;
            if (i > 1) {
                tokos = (loanSum) * loanPercent / 100;
            }
            loanSum = loanSum - mayrgumar;

            if (mayrgumar > mnacord) {
                mayrgumar = mnacord;
            }
            System.out.print(calendar.get(Calendar.YEAR)
                    + "-"
                    + calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT,
                    Locale.US) + "-" + calendar.get(Calendar.DATE));

            System.out.print(" mayr gumar - " + mayrgumar);
            System.out.print(" tokos - " + tokos);
            System.out.print(" mnacord - " + mnacord);
            System.out.println(" ");

        }

    }

}
