public class Main {
    public static void main(String[] args) {
        System.out.println("Jenkins test Project, starting out super plain.");
        int add = simpleAddition(10,12);
        int mult = simpleMultiplication(2,4);
        int sub = simpleSubtraction(3,4);
        System.out.printf("Addition: %d\n Multiplication: %d\n Subtraction: %d");

    }
    public static int simpleAddition(int a, int b){
        return a+b;
    }
    public static int simpleSubtraction(int a, int b){
        return a-b;
    }
    public static int simpleMultiplication(int a, int b){
        return a*b;
    }
}
