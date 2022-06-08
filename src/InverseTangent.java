public class InverseTangent {
    public static void main(String[] args) {
        // Formula for exact value of PI: 16arctan(1/5)-4arctan(1/(239)).
        double pi = 16 * Math.atan(0.2) - 4 * Math.atan((double)1/(double)239);
        System.out.println("Real PI / Calculated:\n" + Math.PI);
        System.out.println(pi);
    }
}
