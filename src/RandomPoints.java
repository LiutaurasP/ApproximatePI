import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomPoints {
    private int howManyPoints;
    List<Vector2D> points;

    RandomPoints(int howManyPoints) {
        this.howManyPoints = howManyPoints;
        points = new ArrayList<Vector2D>();
        calcPI();

    }

    private void calcPI() {
        generateRandomPoints();
        int inPoints = 0;
        Vector2D currentVector;
        for (int i = 0; i < howManyPoints; i++) {
            currentVector = points.get(i);
            if (Math.pow(currentVector.x, 2) + Math.pow(currentVector.y, 2) <= 25) {
                inPoints++;
            }
        }


        double PI = ((double) inPoints / (double) howManyPoints) * 4;
        System.out.println("Approx PI is: " + PI + " Real value: " + Math.PI);
        System.out.println("It is off by " + Math.abs(PI - Math.PI) + " or " + (Math.abs(PI - Math.PI) / Math.PI) * 100 + "%");
    }

    private void generateRandomPoints() {

        for (int i = 0; i < howManyPoints; i++) {
            points.add(new Vector2D(randomizer(-5, 5), randomizer(-5, 5)));
        }
    }

    // Source: https://www.baeldung.com/java-generating-random-numbers-in-range
    private double randomizer(double min, double max) {
        Random random = new Random();
        return random.nextDouble() * (max - min) + min;
    }


    public static void main(String[] args) {
        for (int i = 1_000_000; i <= 100_000_000; i+=1_000_000) {
            System.out.println("------------------------");
            System.out.println("USING "+ i + " POINTS:");
            RandomPoints test = new RandomPoints(i);
            System.out.println("------------------------");

        }

    }
}
