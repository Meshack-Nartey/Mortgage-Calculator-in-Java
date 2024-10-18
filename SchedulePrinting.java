import java.text.NumberFormat;

public class SchedulePrinting {

    private static void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------------");
        System.out.println();
    }

    public static void printMortgageInfo(double mortgage) {
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("------------------");
        System.out.println("Monthly Payments: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
