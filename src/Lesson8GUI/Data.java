package Lesson8GUI;

public class Data {

    private String loanSum;
    private String year;
    private String percent;
    private String sum;
    

    @Override
    public String toString() {
        return "Data{" +
                "loanSum='" + loanSum + '\'' +
                ", year='" + year + '\'' +
                ", percent='" + percent + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }

    public String getLoanSum() {
        return loanSum;
    }

    public void setLoanSum(String loanSum) {
        this.loanSum = loanSum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
