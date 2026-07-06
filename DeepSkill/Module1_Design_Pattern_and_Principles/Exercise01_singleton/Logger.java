package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise01_singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Instance Created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
