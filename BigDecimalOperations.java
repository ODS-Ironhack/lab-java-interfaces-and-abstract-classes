import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static double rounderToHundredth(BigDecimal num){
        return num.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static double rounderToTenthReverser(BigDecimal num){
        return num.setScale(1, RoundingMode.HALF_UP).negate().doubleValue();
    }
}
