package model.SingleTone;

import JAXB.entities.BusType;
import JAXB.entities.TrainType;

import java.util.*;

public class SingleToneList {
    private static SingleToneList instance;
    public static Map<String,BusType> buses;
    public static Map<String, TrainType> trains;
    private int value;

    private SingleToneList(int value) {
        this.value=value;
        buses=new HashMap<>();
        trains=new HashMap<>();
    }

    public String print(int type){
        String result=new String();
        Collection<BusType> busColl=buses.values();
        Collection<TrainType> trainColl=trains.values();
        if(type==1) {
            for (BusType b : busColl) {
                result += "<tr>"+b.print()+"<td><input type='checkbox' name='listOfBuses' value='"+b.getNum()+"'></td></tr>";
            }
        }
        if(type==2) {
            for (TrainType t : trainColl) {
                result += "<tr>"+t.print()+"<td><input type='checkbox' name='listOfTrains' value='"+t.getNum()+"'></td></tr>";
            }
        }
        return result;
    }
    public void removeBus(String key){
        buses.remove(key);
    }
    public void removeTrain(String key){
        trains.remove(key);
    }
    public void addBus(BusType obj){
        buses.put(obj.getNum(), obj);
    }
    public void addTrain(TrainType obj){
        trains.put(obj.getNum(), obj);
    }
    public static SingleToneList getInstance(int value) {
        if (instance == null) {
            instance = new SingleToneList(value);
        }
        return instance;
    }
}
