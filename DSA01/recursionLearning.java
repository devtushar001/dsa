package DSA01;
// What is recursion :- recursion is a programming technique where a method call itself to solve the smaller part of same problem.
// Every recursive solution has
// 1. A base case --> stop the recursion.
// 2. A recursive case --> Keep calling itself for smaller input.

// Simple example for printing numbers.
public class recursionLearning {
    // Simple recursion (Printing Numbers)
    static void PrintNumber (int num) {
        // Base case 
        if (num == 0) {
            return;
        }

        System.out.println(num);
        PrintNumber(num - 1);
    }
    public static void main(String[] args) {
        PrintNumber(5);
    }
}


// Output :- 5 4 3 2 1