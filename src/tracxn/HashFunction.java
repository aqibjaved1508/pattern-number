package tracxn;

import java.time.Instant;

public class HashFunction {

    public static void main(String[] args) {

        System.out.println(HashFunction.generateHashCode());

    }

    public static String generateHashCode() {
        String epoch = String.format("%.3f", (double) Instant.now().toEpochMilli() / 1000);

        String[] tokens = epoch.split("\\.");
        String sumLeft = calculateSum(Long.parseLong(tokens[0])) + "";
        String sumRight = calculateSum(Long.parseLong(tokens[1])) + "";

        return String.format("%s-%s-%s", epoch, sumLeft, sumRight);

    }

    private static long calculateSum(long number) {
        long sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
