public class WordDocumentFactory extends DocFactory {
    @Override
    public Documents createDocument() {
        return new WordDocument();
    }
}

