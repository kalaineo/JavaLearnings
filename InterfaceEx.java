interface MathOperation {
    int execute(int a, int b);
}

class Addition implements MathOperation {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
class Subtraction implements MathOperation {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class MathRunner {
    private MathOperation operation;

    MathRunner(MathOperation operation) {
        this.operation = operation;
    }

    void result( int a, int b) {
        System.out.println("\n The math operation result is "+ operation.execute(a, b));
    }
}


public class InterfaceEx {
    public static void main(String args[]) {
        int a = 100;
        int b = 50;

        MathRunner add = new MathRunner(new Addition());
        add.result(a, b);

        MathRunner sub = new MathRunner(new Subtraction());
        sub.result(a, b);
    }
}
