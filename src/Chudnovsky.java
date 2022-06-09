import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Chudnovsky {
    int precision;

    Chudnovsky(int precision) {
        this.precision = precision;
    }

    public BigDecimal calculatePI() {
        BigDecimal a = new BigDecimal(1);
        BigDecimal aSum = new BigDecimal(1);
        BigDecimal bSum = new BigDecimal(0);
        BigDecimal C = new BigDecimal(640320);
        BigDecimal C3over24 = (C.multiply(C)).multiply(C).divide(new BigDecimal(24), new MathContext(precision + 5));

        BigDecimal k = new BigDecimal(1);
        BigDecimal minusOne = new BigDecimal(-1);
        BigDecimal one = new BigDecimal(1);
        BigDecimal two = new BigDecimal(2);
        BigDecimal five = new BigDecimal(5);
        BigDecimal six = new BigDecimal(6);

        while (k.longValue() < precision * 0.1) {
            a = a.multiply((minusOne.multiply((six.multiply(k)).subtract(five)).multiply((two.multiply(k)).subtract(one)).multiply((six.multiply(k)).subtract(one))).divide((((k.multiply(k)).multiply(k)).multiply(C3over24)), new MathContext(precision + 5)));
            aSum = aSum.add(a);
            bSum = bSum.add(k.multiply(a));
            k = k.add(one);
          //  System.out.println(k.longValue()+"/"+precision*0.1);
        }

        BigDecimal aMult = new BigDecimal("13591409").multiply(aSum);
        BigDecimal bMult = new BigDecimal("545140134").multiply(bSum);

        BigDecimal top = new BigDecimal(426880).multiply(new BigDecimal(10005).sqrt(new MathContext(precision + 5)));
        BigDecimal bottom = aMult.add(bMult);

        return top.divide(bottom, new MathContext(precision + 5)).setScale(precision, RoundingMode.DOWN);

    }


    public static void main(String[] args) {
        Chudnovsky test = new Chudnovsky(1000);
        long startTime = System.nanoTime();
        BigDecimal PI = test.calculatePI();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration/1000000);
        System.out.println(PI);
    }

}
