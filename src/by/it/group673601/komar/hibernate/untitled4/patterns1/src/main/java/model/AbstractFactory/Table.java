package model.AbstractFactory;

import javax.xml.bind.JAXBException;
import java.text.ParseException;
import java.util.List;

public interface Table{
    String print() throws JAXBException;
    String simpleSelect(String parameter, int whichOne);
    String selectInInterval(String begin, String end) throws ParseException;
    String printOne(int index);
}
