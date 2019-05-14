package model.AbstractFactory;

import JAXB.entities.BusType;
import JAXB.entities.BusesType;
import JAXB.parser.Parser;
import JAXB.parser.XmlParser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BusTable implements Table {
    Parser parser;
    File file;
    BusesType buses;
    List<BusType> bus;
    public BusTable(){
        try {
            parser = new XmlParser();
            file = new File("D:\\Универ\\ВДиШП\\patterns1\\src\\DataXML\\buses.xml");
            buses = (BusesType) parser.getElement(file, BusesType.class);
            bus = buses.getBus();
        }
        catch (JAXBException e){
            System.out.println(e.getMessage());
        }
    }

    public List<BusType> getData() {
        return bus;
    }


    public String print(){
        String result=new String();
        int i=0;
        for(BusType b : bus){
            result+="<tr>"+b.print()+"<td><input type='checkbox' name='listOfBuses' value='"+i+"'></td></tr>\n";
            i++;
        }
        return result;
    }
    public String simpleSelect(String parameter, int whichOne){String result=new String();
        int i=0;
        for(BusType b : bus){
            if(whichOne==0) {
                if (b.getDestinition().equals(parameter) == true) {
                    result+="<tr>"+b.print()+"<td><input type='ch<td><input type='checkbox' name='listOfBuses' value='"+i+"'></td>\n";
                    i++;
                }
            }
            if(whichOne==1) {
                if (b.getVokzalLiving().equals(parameter) == true) {
                    result+="<tr>"+b.print()+"<td><input type='ch<td><input type='checkbox' name='listOfBuses' value='"+i+"'></td>\n";
                    i++;
                }
            }
            if(whichOne==2) {
                if (b.getDateLiving().equals(parameter) == true) {
                    result+="<tr>"+b.print()+"<td><input type='ch<td><input type='checkbox' name='listOfBuses' value='"+i+"'></td>\n";
                    i++;
                }
            }
        }
        return result;
    }
    public String selectInInterval(String begin, String end) throws ParseException{
        String result=new String();
        if(begin=="") begin="01.01.2000";
        if(end=="") end="01.01.2030";
        if(begin.compareTo(end)>0){
            String buf=begin;
            begin=end;
            end=buf;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date dateT=new Date();
        Date dateB=new Date();
        Date dateE=new Date();
        try {
            dateB=sdf.parse(begin);
            dateE=sdf.parse(end);
            int i=0;
            for (BusType b : bus) {
                dateT=sdf.parse(b.getDateLiving());
                if (!(dateT.before(dateB) || dateT.after(dateE))==true) {
                    result+="<tr>"+b.print()+"<td><input type='ch<td><input type='checkbox' name='listOfBuses' value='"+i+"'></td>\n";
                    i++;
                }
            }
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public String printOne(int index) {
        BusType obj=bus.get(index);
        return obj.print();
    }
}
