import java.util.Scanner;

public class Testing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the population standard deviation
        double standardDeviation = calculateStandardDeviation(array);

        // Print the result with specified formatting
        System.out.printf("Standard Deviation: %.15f\n", standardDeviation);

        scanner.close();
    }

    // Function to calculate the population standard deviation of an array
    public static double calculateStandardDeviation(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double mean = (double) sum / array.length;

        double sumSquaredDiff = 0;
        for (int num : array) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }

        double standardDeviation = Math.sqrt(sumSquaredDiff / array.length);
        return standardDeviation;
    }
}
