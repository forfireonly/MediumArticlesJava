public class Calculator {
    //instance variables
    private int firstNumber;
    private int secondNumber;

    //constructor
    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void add() {
       int sum = this.firstNumber + this.secondNumber;
       System.out.printf("%d + %d = %d\n", this.firstNumber, this.secondNumber, sum);
    }

    public void subtract() {
        int difference = this.firstNumber - this.secondNumber;
        System.out.printf("%d - %d = %d\n", this.firstNumber, this.secondNumber, difference);
    }

    public void multiply() {
        int product = this.firstNumber * this.secondNumber;
        System.out.printf("%d x %d = %d\n", this.firstNumber, this.secondNumber, product);
    }

    public void divide() {
        int quotient = this.firstNumber / this.secondNumber;
        System.out.printf("%d : %d = %d\n\n", this.firstNumber, this.secondNumber, quotient);
    }

    //driver method
    public static void main(String[] args) {

        //create a calculator object
        Calculator myCalculator = new Calculator(8,4);

        myCalculator.add();
        myCalculator.subtract();
        myCalculator.multiply();
        myCalculator.divide();

        //create a calculator object
        myCalculator = new Calculator(10,5);

        myCalculator.add();
        myCalculator.subtract();
        myCalculator.multiply();
        myCalculator.divide();
    }

}
