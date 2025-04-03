import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1= new BigDecimal(34.97845);
        BigDecimal num2= new BigDecimal(-837.382749);

        System.out.println(BigDecimalOperations.rounderToHundredth(num1));
        System.out.println(BigDecimalOperations.rounderToTenthReverser(num1));

        System.out.println(BigDecimalOperations.rounderToHundredth(num2));
        System.out.println(BigDecimalOperations.rounderToTenthReverser(num2));
    }

}
