package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise02_factory;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}