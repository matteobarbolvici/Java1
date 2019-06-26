package Lab4.Calculator;

public class LogicalOp {

    public void numberParameter(int number) {
        for (int i = number; number <= 100; number++) {
            System.out.println(number);
        }
    }

    public void numberParameter1(int number) {
        for (int i = number; number >= -100; number--) {
            System.out.println(number);
        }
    }

    public void twoNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void twoParameters(int x, int y) {
        if (x > y) {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        } else if (y > x) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }

    public void displayEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void displayOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

    public void addNumbers(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void stars() {
        for (int i = 1; i < 8; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void numberParameters(int numbers) {
        while (numbers < 100) {
            numbers++;
            System.out.println(numbers);
        }

    }

    public void negativeNumberParameter(int numbers) {
        while (numbers > -100) {
            numbers--;
            System.out.println(numbers);
        }

    }

    public void printFromXToY(int x, int y) {
        while (x < y) {
            x++;
            System.out.println(x);
        }
    }

    public void biggestNumber(int x, int y) {
        if (x > y) {
            while (x > y) {
                y++;
                System.out.println(y);
            }
        } else if (x < y) {
            while (x < y) {
                x++;
                System.out.println(x);
            }
        }
    }

    public void oneToHundredEven() {
        int number = 0;
        while (number <= 100) {
            number++;
            if (number % 2 == 0)

                System.out.println(number);
        }
    }

    public void oneToHundredOdd() {
        int number = 0;
        while (number < 100) {
            number++;
            if (!(number % 2 == 0)) ;
            System.out.println(number);
        }
    }

    public void printSumAndAverage() {
        int sum = 0;
        for (int i = 111; i <= 8899; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(" Average is: " + (sum / 8899f));
    }


    public void printFibonacciNumbers(int n) {

        int f1 = 1; int f2 = 1; int i;

        if (n < 1)
            return;

        for (i = 1; i <= 20; i++) {
            System.out.println(f2 + " ");



        }
    }

    public void CozaLozaWoza(){
        boolean clwFlag;
        for (int i = 1; i <= 110; i++) {
            clwFlag = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                clwFlag = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                clwFlag = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                clwFlag = true;
            }
            if ( ! clwFlag) {
                System.out.print(i);
            }
            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}









