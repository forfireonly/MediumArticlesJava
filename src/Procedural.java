public class Procedural {
    public static void main(String[] args) {
        // write your code here
        //declaring and initializing two numbers
        int firstNumber = 8;
        int secondNumber = 4;

        //performing operations
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        //Displaying result
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, sum );

        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, difference);
        System.out.printf("%d x %d = %d\n", firstNumber, secondNumber, product);
        System.out.printf("%d : %d = %d", firstNumber, secondNumber, quotient);
    }
}
