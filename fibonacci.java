
class fibonacci {

    static int stepCount = 0;

    // Function to calculate Fibonacci number using recursion
    static int fibonacci(int n) {
        stepCount++;
        if (n <= 1) { // Base case: if n is 0 or 1, return n
            return n;
        }
        // Recursive call for the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        System.out.println("Total steps taken: " + stepCount);
    }
}

// public class fibonacci {
//     public static void main(String[] arguments) {
//         int n = 10, firstNum = 0, secondNum = 1;
//         int nextNum;
//         for (int i = 1; i <= n; i++) {
//             System.out.print(firstNum + ", ");
//             nextNum = firstNum + secondNum;
//             firstNum = secondNum;
//             secondNum = nextNum;
//         }
//     }
// };
