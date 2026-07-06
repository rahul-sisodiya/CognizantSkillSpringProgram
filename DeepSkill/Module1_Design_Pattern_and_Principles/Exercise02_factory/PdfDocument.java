package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise02_factory;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}