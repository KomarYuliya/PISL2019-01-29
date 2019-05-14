package JAXB.parser;

import javax.xml.bind.JAXBException;
import java.io.File;

public interface Parser {
    void setElement(File file, Object obj) throws JAXBException;
    Object getElement(File file, Class clas) throws JAXBException;
}
