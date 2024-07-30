public class XlsDocumentFactory extends DocFactory {
    @Override
    public Documents createDocument() {
        return new XlsDocument();
    }
}
