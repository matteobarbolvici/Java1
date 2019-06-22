package Lab4.Calculator;

public class LogicalOp {

    public void numberParameter(int number){
        for (int i=number; number<=100; number++){
            System.out.println(number);
        }
    }

    public void numberParameter1(int number){
        for (int i=number; number>=-100; number--){
            System.out.println(number);
        }
    }

    public void twoNumbers(int x, int y){
        for (int i=x; i<=y; i++){
            System.out.println(i);
        }
    }

    public void twoParameters(int x, int y){
        if (x>y){
            for(int i=y; i<=x; i++){
                System.out.println(i);
            }
        }
        else if(y>x){
            for(int i=x; i<=y; i++){
                System.out.println(i);
            }
        }
    }

    public void displayEvenNumbers(){
        for (int i=1; i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    public void displayOddNumbers(){
        for (int i=1; i<=100;i++){
            if (!(i%2==0)){
                System.out.println(i);
            }
        }
    }

    public void addNumbers(int number){
        int sum = 0;
        for (int i=number; i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

    public void stars(){
        for (int i=1; i<8; i++)
        {
            for (int j=i; j<=7; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void numberParameters(int numbers){
        while (numbers<100){
            numbers++;
            System.out.println(numbers);
        }

    }

    public void negaiveNumberParameter(int numbers){
        while (numbers>-100){
            numbers--;
            System.out.println(numbers);
        }

    }
    public void printFromXToY(int x, int y){
        while (x<y){
            x++;
            System.out.println(x);
        }
    }

    public void biggestNumber(int x, int y){
        if (x > y) {
            while (x > y) {
                y++;
                System.out.println(y);
            }
        }
        else if(x < y){
            while (x < y) {
                x++;
                System.out.println(x);
            }
        }
    }
    public void oneToHundredEven() {
        int number = 0;
        while (number <= 100){
            number++;
            if (number % 2 == 0)

                System.out.println(number);
        }
    }

    public void oneToHundredOdd() {
        int number = 0;
        while (number < 100){
            number++;
            if (!(number % 2 == 0))

                System.out.println(number);
        }
    }




}





