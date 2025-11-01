package DSA01;

public class factorialRecurion {
    // Example :- Factorial using recursion
    static int FactorialExample(int num) {
        // Base case 
        if (num == 0) return 1;
        
        return num * FactorialExample(num - 1);
    }
    public static void main(String[] args) {
        System.out.println(",");
        System.out.println(FactorialExample(5));
    }
}

// Execution flow
// factorial(5)
// = 5 * factorial(4)
// = 5 * 4 * factorial(3)
// = 5 * 4 * 3 * factorial(2)
// = 5 * 4 * 3 * 2 * factorial(1)
// = 5 * 4 * 3 * 2 * 1
// = 120


//Each factorial(n) call is pushed to the call stack until the base case, then results are returned upward.
