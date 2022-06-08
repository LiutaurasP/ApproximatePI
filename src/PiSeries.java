public class PiSeries {
    // PI/4 = 1/1 - 1/3 + 1/5 - 1/7 + 1/9...
    // PI = 4/1 - 4/3 + 4/5 - 4/7 + 4/9...
    int iterations;
    PiSeries(int iterations) {
        this.iterations = 2 * iterations;
        calculatePi();
    }

    private void calculatePi() {
        double PI = 0;
        double numerator = 4;
        for (double i = 1; i < iterations; i += 2) {
            PI += numerator / i;
            numerator = -1 * numerator;
        }
        System.out.println(PI);

    }

    public static void main(String[] args) {
        for (int i = 100_000; i <= 10_000_000; i += 100_000) {
            System.out.println("------------------------");
            System.out.println("USING " + i + " FRACTIONS:");
            System.out.println("Real PI / Calculated:\n" + Math.PI);
            new PiSeries(i);
        }

    }
}
