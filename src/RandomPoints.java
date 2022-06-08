import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomPoints {
    private int howManyPoints;
    RandomPoints(int howManyPoints) {
        this.howManyPoints = howManyPoints;
        calcPI();

    }
    private void calcPI() {
        int inPoints = 0;
        for (int i = 0; i < howManyPoints; i++) {
            if (Math.pow(randomizer(-100,100), 2) + Math.pow(randomizer(-100,100), 2) < 10000) {
                inPoints++;
            }
        }


        double PI = ((double) inPoints / (double) howManyPoints) * 4;
        System.out.println(PI);
        //   System.out.println("It is off by " + Math.abs(PI - Math.PI) + " or " + (Math.abs(PI - Math.PI) / Math.PI) * 100 + "%");
    }



    // Source: https://www.baeldung.com/java-generating-random-numbers-in-range
    private double randomizer(double min, double max) {
        Random random = new Random();
        return random.nextDouble() * (max - min) + min;
    }


    public static void main(String[] args) {
        for (int i = 100_000; i <= 10_000_000; i += 100_000) {
            System.out.println("------------------------");
            System.out.println("USING " + i + " POINTS:");
            System.out.println("Real PI / Calculated:\n" + Math.PI);
            new RandomPoints(i);

        }

    }
}
