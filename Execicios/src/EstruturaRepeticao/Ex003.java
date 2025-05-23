package EstruturaRepeticao;

public class Ex003 {
    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = 1;

        while (firstNumber <= 500) {
            System.out.print(firstNumber + ",");
            fibonacci = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }
}
