import java.text.NumberFormat;

public class MonthlyInstallment {
    private final double balance = 0;



    public static void monthlyInstallments(int numberOfPayments, int principal, float annual_Interest_Rate, int MONTH_IN_YEAR, byte years)
    {
        double balance =0;
        double monthlyInterestRate = annual_Interest_Rate / MONTH_IN_YEAR;
        numberOfPayments = MONTH_IN_YEAR * years;
        for (int i = 1; i <= numberOfPayments; i++) {
            balance = principal * ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - (Math.pow(1 + monthlyInterestRate, i))) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
            String balanceLeft = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceLeft);
        }

    }

}
