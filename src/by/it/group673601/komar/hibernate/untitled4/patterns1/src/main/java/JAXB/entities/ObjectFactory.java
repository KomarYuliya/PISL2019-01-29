
package JAXB.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the JAXB.entities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Trains_QNAME = new QName("", "trains");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: JAXB.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrainsType }
     * 
     */
    public TrainsType createTrainsType() {
        return new TrainsType();
    }

    /**
     * Create an instance of {@link TrainType }
     * 
     */
    public TrainType createTrainType() {
        return new TrainType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "trains")
    public JAXBElement<TrainsType> createTrains(TrainsType value) {
        return new JAXBElement<TrainsType>(_Trains_QNAME, TrainsType.class, null, value);
    }

}
