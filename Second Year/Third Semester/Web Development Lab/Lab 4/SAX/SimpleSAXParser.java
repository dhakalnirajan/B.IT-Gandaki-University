import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
public class SimpleSAXParser extends DefaultHandler {
    public static void main(String[] args) {
        try {
            // Create a SAXParserFactory
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // Create a SAXParser
            SAXParser parser = factory.newSAXParser();
            // Provide the path to your XML file or create an InputStream
            InputStream xmlInput =
            SimpleSAXParser.class.getResourceAsStream("example.xml");
            // Create an instance of your content handler
            SimpleSAXParser handler = new SimpleSAXParser();
            // Parse the XML document
            parser.parse(xmlInput, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    @Override
    public void startElement(String uri, String localName, String qName,
    Attributes attributes) throws SAXException {
    System.out.println("Start Element: " + qName);
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
    String data = new String(ch, start, length).trim();
    if (!data.isEmpty()) {
    System.out.println("Character Data: " + data);
    }
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws
    SAXException {
    System.out.println("End Element: " + qName);
}
}
