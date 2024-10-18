import java.text.NumberFormat;
import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {

                final int MONTH_IN_YEAR = 12;
                int principal = (int) UserInputReader.readNumber("Principal:", 1000, 100_000_000);
                float annual_Interest_Rate = (float) UserInputReader.readNumber("Annual Interest Rate:", 1, 30);
                byte years = (byte) UserInputReader.readNumber("Period(Years):", 1, 30);

                double mortgage = CalculateMortgage.calculateMortgage(principal, annual_Interest_Rate, years);
                SchedulePrinting.printMortgageInfo(mortgage);


                int numberOfPayments = MONTH_IN_YEAR * years;
               SchedulePrinting.printMortgageInfo(mortgage);
                MonthlyInstallment.monthlyInstallments(numberOfPayments, principal, annual_Interest_Rate, MONTH_IN_YEAR, years);


            }

        }


