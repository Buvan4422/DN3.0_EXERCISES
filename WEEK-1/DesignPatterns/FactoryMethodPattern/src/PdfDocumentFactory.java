public class PdfDocumentFactory extends DocFactory {
    @Override
    public Documents createDocument() {
        return new PdfDocument();
    }
}
