package JAXB.parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class XmlParser implements Parser {
    public void setElement(File file, Object obj) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller=context.createMarshaller();
        marshaller.marshal(obj, file);
    }
    public Object getElement(File file, Class clas) throws JAXBException{
        JAXBContext context=JAXBContext.newInstance(clas);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Object object=unmarshaller.unmarshal(file);
        return object;
    }
}
