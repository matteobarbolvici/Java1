package Lab3.Calculator;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2, 3);

        System.out.println("The bigger number is: " + biggest);

        System.out.println(op.textComparator("FastTrackIT"));

        System.out.println(op.compareTextAndInt("ggg",4));

        System.out.println(op.compareTextAndInt("FastTrackIT",3));

        System.out.println(op.compareTextAndInt("fdgdfn dfhdfhfd",6867867));

        System.out.println(op.snowAmmount(5));

        System.out.println(op.numberComparator(5));

        System.out.println(op.numberComparator(2));

        System.out.println(op.oddOrEven(6));

        System.out.println(op.oddOrEven(7));

        System.out.println(op.isEligibleToVote(17));

        System.out.println(op.isEligibleToVote(18));

        System.out.println(op.threeNumbers(1,3,5));



    }
}

