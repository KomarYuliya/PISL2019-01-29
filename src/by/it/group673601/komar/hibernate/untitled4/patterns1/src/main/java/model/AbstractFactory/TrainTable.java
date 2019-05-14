package model.AbstractFactory;

import JAXB.entities.TrainType;
import JAXB.entities.TrainsType;
import JAXB.parser.Parser;
import JAXB.parser.XmlParser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TrainTable implements Table {
    Parser parser;
    File file;
    TrainsType trains;
    List<TrainType> train;
    public TrainTable() {
        try {
            parser = new XmlParser();
            file = new File("D:\\Универ\\ВДиШП\\patterns1\\src\\DataXML\\trains.xml");
            trains = (TrainsType) parser.getElement(file, TrainsType.class);
            train = trains.getTrain();
        }
        catch (JAXBException e){
            System.out.println(e.getMessage());
        }
    }

    public List<TrainType> getData() {
        return train;
    }


    public String print(){
        String result=new String();
        int i=0;
        for(TrainType t :train){
            result+="<tr>"+t.print()+"<td><input type='checkbox' name='listOfTrains' value='"+i+"'></td></tr>\n";
            i++;
        }
        return result;
    }
    public String simpleSelect(String parameter, int whichOne){String result=new String();
        int i=0;
        for(TrainType t :train){
            if(whichOne==0) {
                if (t.getDestinition().equals(parameter) == true) {
                    result+="<tr>"+t.print()+"<td><input type='ch<td><input type='checkbox' name='listOfTrains' value='"+i+"'></td>\n";
                    i++;
                }
            }
            if(whichOne==1) {
                if (t.getVokzalLiving().equals(parameter) == true) {
                    result+="<tr>"+t.print()+"<td><input type='ch<td><input type='checkbox' name='listOfTrains' value='"+i+"'></td>\n";
                    i++;
                }
            }
            if(whichOne==2) {
                if (t.getDateLiving().equals(parameter) == true) {
                    result+="<tr>"+t.print()+"<td><input type='ch<td><input type='checkbox' name='listOfTrains' value='"+i+"'></td>\n";
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
            for (TrainType t :train) {
                dateT=sdf.parse(t.getDateLiving());
                if (!(dateT.before(dateB) || dateT.after(dateE))==true) {
                    result+="<tr>"+t.print()+"<td><input type='ch<td><input type='checkbox' name='listOfTrains' value='"+i+"'></td>\n";
                    i++;
                }
            }
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public String printOne(int index) {
       TrainType obj=train.get(index);
       return obj.print();
    }

}
