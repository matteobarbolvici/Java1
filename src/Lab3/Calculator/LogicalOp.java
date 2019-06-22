package Lab3.Calculator;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }
    }

    public String textComparator(String inputText) {

        if (inputText.equals("FastTrackIT")) {

            return "Learning text comparison!";

        } else {
            return "Got to try some more";
        }

    }

    public String compareTextAndInt(String text, int number) {
        if (text.equals("FastTrackIT") && number == 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return number + text;
        }
        return "not working";
    }

    public String snowAmmount(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm):" + number;

        }
    }

    public String numberComparator(int number) {
        if (number > 3 && !(number == 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        }
        return "not working";
    }

    public String oddOrEven(int number) {
        if (number % 2 == 0)
           return  "The number is even.";
        else
            return "The number is odd.";
    }

    public Boolean isEligibleToVote(int number) {
        if (number>=18) {
            return true;
        }
        else {
            return false;

        }
    }

    public int threeNumbers(int x, int y, int z){

        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else if (z > x && z > y)
            return z;
        else return 0;
    }


}


