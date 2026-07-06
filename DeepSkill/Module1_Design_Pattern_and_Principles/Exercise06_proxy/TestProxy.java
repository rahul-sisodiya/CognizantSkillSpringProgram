package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise06_proxy;

public class TestProxy {

    public static void main(String[] args) {

        Image image = new ProxyImage("student_photo.jpg");

        System.out.println("First Display:");
        image.display();

        System.out.println("\nSecond Display:");
        image.display();
    }
}