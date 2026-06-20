@FunctionalInterface
interface Operation {
    int execute(int a, int b);
}


class FunctionalInterfaceEx {

    public static void main(String args[]) {
        Operation add = (a, b)-> a + b;
        Operation sub = (a, b)-> a - b;
        Operation mul = (a, b)-> a * b;

        System.out.println(add.execute(3, 4));
        System.out.println(sub.execute(2 ,5));
        System.out.println(mul.execute(6, 6));
    }
}