🧩 1. What is Recursion?

Recursion is a programming technique where a method calls itself to solve a smaller part of the same problem.
Every recursive solution has:

A base case → stops the recursion.

A recursive case → keeps calling itself with smaller input.

🧠 Example 1: Simple Recursion (Printing Numbers)
public class RecursionExample {
    static void printNumbers(int n) {
        // Base case
        if (n == 0)
            return;

        // Recursive case
        System.out.println(n);
        printNumbers(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}


Output:

5
4
3
2
1

🔁 2. How Recursion Works Internally (Call Stack)

When a function calls itself, each call is stored on the Call Stack until the base case is reached.
The stack then unwinds (returns from the last call to the first).

Let’s trace this with the above example printNumbers(3):

Call Stack (Top = Current Call)	Action
printNumbers(3)	Calls printNumbers(2)
printNumbers(2)	Calls printNumbers(1)
printNumbers(1)	Calls printNumbers(0)
printNumbers(0)	Base case → returns
Return → printNumbers(1) finishes	... continues up the stack

🧩 The stack ensures each call has its own local variables and state, even if it’s the same method.

🔄 3. Example: Factorial using Recursion

Mathematical definition:
n! = n × (n - 1)!, and 1! = 1.

public class FactorialExample {
    static int factorial(int n) {
        // Base case
        if (n == 1)
            return 1;

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}


🧮 Execution flow:

factorial(5)
= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)
= 5 * 4 * 3 * 2 * 1
= 120


Each factorial(n) call is pushed to the call stack until the base case, then results are returned upward.

⚠️ 4. Common Mistakes in Recursion

❌ No base case → causes infinite recursion → StackOverflowError

❌ Wrong base case condition → may never reach stopping point.

❌ Changing input incorrectly → recursion doesn’t progress toward the base case.

⚙️ 5. Call Stack Visualization

Example:
factorial(3)

Stack Frame (Top → Bottom)	Returns
factorial(3)	3 * factorial(2)
factorial(2)	2 * factorial(1)
factorial(1)	1
(returns)	3 * 2 * 1 = 6
🚀 6. Tail Recursion (Optimization idea)

In Tail Recursion, the recursive call is the last statement in the function.
Some compilers can optimize this (though Java doesn’t by default).

static int tailFactorial(int n, int result) {
    if (n == 1)
        return result;
    return tailFactorial(n - 1, n * result); // tail call
}


Usage:

System.out.println(tailFactorial(5, 1)); // Output: 120

🧾 Summary Table
Concept	Description	Example
Base Case	Stops recursion	if (n == 0) return;
Recursive Case	Calls itself	printNumbers(n-1);
Call Stack	Stores active method calls	Managed by JVM
Stack Overflow	Infinite recursion	Missing base case
Tail Recursion	Recursive call at end	return f(n-1, result*n);