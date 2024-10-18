import java.text.NumberFormat;

public class CalculateMortgage {

     //Fields
    private final int PERCENTAGE = 100;
    private final int MONTH_IN_YEAR = 12;


    //Constructors for the variables
    public CalculateMortgage(int principal, float annual_Interest_Rate, byte years) {
    }


    //Method for calculating the mortgage.
    public static double calculateMortgage( int  principal, float annual_Interest_Rate, byte years) {
        final int PERCENTAGE = 100;
        final int MONTH_IN_YEAR = 12;
        float numberOfPayments = MONTH_IN_YEAR * years;
        annual_Interest_Rate = (annual_Interest_Rate / PERCENTAGE) / MONTH_IN_YEAR;

        double Mortgage = principal * annual_Interest_Rate * Math.pow(1 + annual_Interest_Rate, numberOfPayments) / (Math.pow(1 + annual_Interest_Rate, numberOfPayments) - 1);
        String amount = NumberFormat.getCurrencyInstance().format(Mortgage);

        System.out.println("Mortgage: " + amount);

        return Mortgage;
    }
}
