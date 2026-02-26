public class factorialcalculator {
    public static void main(String[] args) {
        int num = 5;  // Predefined number to calculate factorial

        int factorial = calculateFactorial(num); // Using recursive method

        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
}
