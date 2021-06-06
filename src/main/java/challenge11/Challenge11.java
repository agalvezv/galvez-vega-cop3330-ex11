package challenge11;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.*;

public class Challenge11 {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        String firstCheck = "How many euros are you exchanging?";
        //System.out.println("How many euros are you exchanging?");
        Output(firstCheck);
        String eurosS = inputs.nextLine();
        BigDecimal eurosBD = new BigDecimal(eurosS);


        String secondCheck = "What is the exchange rate?";
        Output(secondCheck);
        //System.out.println("What is the exchange rate?");
        String exchangeS = inputs.nextLine();
        BigDecimal exchangeBD = new BigDecimal(exchangeS);

        //MathContext m = new MathContext(4);
        BigDecimal conversionBD = eurosBD.multiply(exchangeBD);
        //BigDecimal conversionCBD = conversionBD.round(m);
        double endValue = conversionBD.doubleValue();
        endValue = Math.round(endValue*100);
        endValue = endValue/100;
        String thirdCheck = endValue + " U.S. dollars.";
        //System.out.println(endValue + " U.S. dollars.");
        Output(thirdCheck);
        //Study big decimal more in the future

    }
    public static void Output(String proxy)
    {
        System.out.println(proxy);
    }
}
