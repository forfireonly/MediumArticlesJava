public class ProceduralWithMethods {

    public static void main(String[] args) {
        int firstNumber = 8;
        int secondNumber = 4;

        displayResult(firstNumber,secondNumber);

        //reuse variables
        firstNumber = 10;
        secondNumber = 5;

        displayResult(firstNumber,secondNumber);
    }

    //method for adding numbers
    static public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    //method for subtracting numbers
    static public int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    //method for multiplying numbers
    static public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    //method for dividing numbers
    static public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    //method for displaying results of math operations
    static public void displayResult(int firstNumber, int secondNumber) {
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, sum(firstNumber, secondNumber) );
        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, subtract(firstNumber, secondNumber));
        System.out.printf("%d x %d = %d\n", firstNumber, secondNumber, multiply(firstNumber, secondNumber));
        System.out.printf("%d : %d = %d\n\n", firstNumber, secondNumber, divide(firstNumber, secondNumber));
    }
}
