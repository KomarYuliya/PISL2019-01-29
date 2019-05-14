
package JAXB.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1111"/>
 *               &lt;enumeration value="2222"/>
 *               &lt;enumeration value="3333"/>
 *               &lt;enumeration value="4444"/>
 *               &lt;enumeration value="5555"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_living" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time_living" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vokzal_living" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platform_living" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vokzal_arriving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticket_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_arriving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time_arriving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainType", propOrder = {
    "num",
    "dateLiving",
    "timeLiving",
    "destinition",
    "vokzalLiving",
    "platformLiving",
    "vokzalArriving",
    "ticketType",
    "cost",
    "dateArriving",
    "timeArriving"
})
public class TrainType {

    @XmlElement(required = true)
    protected String num;
    @XmlElement(name = "date_living", required = true)
    protected String dateLiving;
    @XmlElement(name = "time_living", required = true)
    protected String timeLiving;
    @XmlElement(required = true)
    protected String destinition;
    @XmlElement(name = "vokzal_living", required = true)
    protected String vokzalLiving;
    @XmlElement(name = "platform_living", required = true)
    protected String platformLiving;
    @XmlElement(name = "vokzal_arriving", required = true)
    protected String vokzalArriving;
    @XmlElement(name = "ticket_type", required = true)
    protected String ticketType;
    @XmlElement(required = true)
    protected String cost;
    @XmlElement(name = "date_arriving", required = true)
    protected String dateArriving;
    @XmlElement(name = "time_arriving", required = true)
    protected String timeArriving;

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */

    public String print(){
        return "<td>"+num+"</td><td>"+dateLiving+"</td><td>"+timeLiving+"</td><td>"+destinition+"</td>" +
                "<td>"+vokzalLiving+"</td><td>"+platformLiving+"</td><td>"+vokzalArriving+"</td><td>"+ticketType+"</td>"+
                "<td>"+cost+"</td><td>"+dateArriving+"</td><td>"+timeArriving+"</td>";
    }
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the dateLiving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLiving() {
        return dateLiving;
    }

    /**
     * Sets the value of the dateLiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLiving(String value) {
        this.dateLiving = value;
    }

    /**
     * Gets the value of the timeLiving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLiving() {
        return timeLiving;
    }

    /**
     * Sets the value of the timeLiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLiving(String value) {
        this.timeLiving = value;
    }

    /**
     * Gets the value of the destinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinition() {
        return destinition;
    }

    /**
     * Sets the value of the destinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinition(String value) {
        this.destinition = value;
    }

    /**
     * Gets the value of the vokzalLiving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVokzalLiving() {
        return vokzalLiving;
    }

    /**
     * Sets the value of the vokzalLiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVokzalLiving(String value) {
        this.vokzalLiving = value;
    }

    /**
     * Gets the value of the platformLiving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformLiving() {
        return platformLiving;
    }

    /**
     * Sets the value of the platformLiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformLiving(String value) {
        this.platformLiving = value;
    }

    /**
     * Gets the value of the vokzalArriving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVokzalArriving() {
        return vokzalArriving;
    }

    /**
     * Sets the value of the vokzalArriving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVokzalArriving(String value) {
        this.vokzalArriving = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the dateArriving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateArriving() {
        return dateArriving;
    }

    /**
     * Sets the value of the dateArriving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateArriving(String value) {
        this.dateArriving = value;
    }

    /**
     * Gets the value of the timeArriving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeArriving() {
        return timeArriving;
    }

    /**
     * Sets the value of the timeArriving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeArriving(String value) {
        this.timeArriving = value;
    }

}
