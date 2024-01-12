package Project;
import java.util.ArrayList;
import java.util.Date;

public class Loan extends ArrayList {
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 10000;
    private Date loanDate;

    Loan(){
        loanDate = new Date();
        loanDate.getTime();
    }
    Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        Date loanDate = new Date();
    }
    double getAnnualInterestRate(){
        return annualInterestRate;
    }
    int getNumberOfYears(){
        return numberOfYears;
    }
    double getLoanAmount(){
        return loanAmount;
    }
    Date getLoanDate(){
        return loanDate;
    }
    void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    double getMonthlyPayment(){
        double monthlyPayment = ((int)(loanAmount * (annualInterestRate / 12 / 100) /
                (1 - 1 / Math.pow(1 + annualInterestRate / 12 / 100, numberOfYears * 12)) * 100) / 100.0);
        return monthlyPayment;
    }
    double getTotalPayment(){

        return (int)(getMonthlyPayment() * numberOfYears * 12 * 100) / 100.0;
    }
    @Override
    public String toString(){
        return "Объект loan:\nгодовая процентная ставка: " + this.annualInterestRate +
                "\nколичество лет: " + this.numberOfYears +
                "\nвремя взятия кредита: " + this.loanDate +
                "\nсумма кредита: " + this.loanAmount;
    }
    public static void main(String[] args) {
        Loan loan = new Loan(4.5, 10, 1_000_000);
        System.out.println("Сумма кредита: " + loan.getLoanAmount() +
                "\nГодовая процентная ставка: " + loan.getAnnualInterestRate() +
                "\nЕжемесячный платеж: " + loan.getMonthlyPayment() +
                "\nОбщая стоимость кредита: " + loan.getTotalPayment());
    }

}
