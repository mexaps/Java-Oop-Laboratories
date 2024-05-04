package lab4;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        Operations operations =  Operations.getInstance(config);

        operations.funcA();
        operations.funcB();



        Operations operations1 = Operations.getInstance(config);
        Operations operations2 = Operations.getInstance(config);


    }
}
