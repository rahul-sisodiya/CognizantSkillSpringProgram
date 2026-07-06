package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise02_factory;

public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}