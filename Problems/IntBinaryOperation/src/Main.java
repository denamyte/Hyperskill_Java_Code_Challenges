abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();

//    public static void main(String[] args) {
//        int firstArg = 3, secondArg = 4;
//        System.out.println(new Addition(firstArg, secondArg).perform());
//        System.out.println(new Multiplication(firstArg, secondArg).perform());
//    }
}

class Addition extends IntBinaryOperation {

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {

    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}

// declare and implement your classes here