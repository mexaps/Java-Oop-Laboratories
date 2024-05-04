package lab4;

public class Operations {

    private static Operations instance = null;
    private Config config;

    private Operations() {

    }

    private Operations(Config config) {

    }

    public static Operations getInstance(Config config) {
        if (instance == null) {
            instance = new Operations(config);
        }
        return instance;
    }

    public void funcA() {

    }

    public void funcB() {

    }

    public void funcC() {

    }

}
