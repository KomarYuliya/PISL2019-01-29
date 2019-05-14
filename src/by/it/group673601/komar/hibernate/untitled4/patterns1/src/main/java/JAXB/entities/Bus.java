package JAXB.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="bus")
@XmlType(propOrder = {"num","date_living","time_living","destinition",
        "vokzal_living","platform_living","vokzal_arriving","cost","bus_mark",
        "time_in_road"})
public class Bus {
    private int num;
    private String date_living;
    private String time_living;
    private String destinition;
    private String vokzal_living;
    private int platform_living;
    private String vokzal_arriving;
    private double cost;
    private String bus_mark;
    private double time_in_road;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate_living() {
        return date_living;
    }

    public void setDate_living(String date_living) {
        this.date_living = date_living;
    }

    public String getTime_living() {
        return time_living;
    }

    public void setTime_living(String timee_living) {
        this.time_living = timee_living;
    }

    public String getDestinition() {
        return destinition;
    }

    public void setDestinition(String destinition) {
        this.destinition = destinition;
    }

    public String getVokzal_living() {
        return vokzal_living;
    }

    public void setVokzal_living(String vokzal_living) {
        this.vokzal_living = vokzal_living;
    }

    public int getPlatform_living() {
        return platform_living;
    }

    public void setPlatform_living(int platform_living) {
        this.platform_living = platform_living;
    }

    public String getVokzal_arriving() {
        return vokzal_arriving;
    }

    public void setVokzal_arriving(String vokzal_arriving) {
        this.vokzal_arriving = vokzal_arriving;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBus_mark() {
        return bus_mark;
    }

    public void setBus_mark(String bus_mark) {
        this.bus_mark = bus_mark;
    }

    public double getTime_in_road() {
        return time_in_road;
    }

    public void setTime_in_road(double time_in_road) {
        this.time_in_road = time_in_road;
    }
}
