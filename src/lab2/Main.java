package lab2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum result is: " + addition(2, 3));
        System.out.println("Subtraction result is: " + subtraction(452, 47));
        System.out.println("Multiplication result is: " + multiplication(5, 5));
        System.out.println("Division result is: " + division(10, 2));
        System.out.println("Number average is: " + numberAverage(20, 39, 75));
        System.out.println("Temperature is: " + temperature(92));
        System.out.println("Distance in meters is " + convertFromInchToMeters(40));
        getDistance(1500, 1, 20, 30);


    }

    public static int addition(int firstNumber, int secondNumber) {

        int result = firstNumber + secondNumber;

        return result;

    }

    public static int subtraction(int firstNumber, int secondNumber) {

        int result = firstNumber - secondNumber;

        return result;
    }

    public static int multiplication(int firstNumber, int secondNumber) {

        int result = firstNumber * secondNumber;

        return result;
    }

    public static int division(int firstNumber, int secondNumber) {

        int result = firstNumber / secondNumber;

        return result;
    }

    public static int numberAverage(int a, int b, int c) {
        int result = a + b + c / 3;
        return result;
    }

    public static double temperature(int degrees) {
        double temp = 5 / 9d * (degrees - 32f);
        return temp;
    }

    public static double convertFromInchToMeters(double inches) {

        double meters = inches * 0.0254;
        return meters;
    }

    public static void getDistance(float distanceM, float hours, float min, float sec) {


        float minSec = min * 60;

        float minHours = hours * 3600;
        float totalNumberSeconds = sec + minSec + minHours;

        float speed = distanceM / totalNumberSeconds;

        System.out.println(speed);
        float distancM = distanceM / totalNumberSeconds;
        System.out.println(speed);
        float distanceKm = distanceM / 1000f;
        float timeHour = totalNumberSeconds / 3600;
        float speedKmHour = distanceKm / timeHour;
        System.out.println(speedKmHour);


    }
}
























