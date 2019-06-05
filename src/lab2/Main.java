package lab2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum result is: " + addition(2,3));
        System.out.println("Subtraction result is: " + subtraction(452,47));
        System.out.println("Multiplication result is: " + multiplication(5,5));
        System.out.println("Division result is: " + division(10,2));
        System.out.println("Number average is: " + numberAverage(20,39, 75));
        System.out.println("Temperature is: " + temperature(92));

    }

    public static int addition(int firstNumber, int secondNumber){

        int result = firstNumber + secondNumber;

        return result;

    } public static int subtraction(int firstNumber, int secondNumber){

        int result = firstNumber - secondNumber;

        return result;
    }

        public static int multiplication(int firstNumber, int secondNumber){

        int result = firstNumber * secondNumber;

        return result;
    }

        public static int division(int firstNumber, int secondNumber){

        int result = firstNumber / secondNumber;

        return result;
    }

    public static int numberAverage(int a, int b, int c) {
        int result=a+b+c/3;
        return result;
    }

    public static double temperature(int degrees) {
        double temp=  5/9d * (degrees -32f);
                return temp;


        }


    }















