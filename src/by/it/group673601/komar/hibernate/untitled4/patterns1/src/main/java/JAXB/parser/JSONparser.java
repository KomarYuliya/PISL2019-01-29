package JAXB.parser;

import JAXB.entities.BusesType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class JSONparser implements Parser {
    public void setElement(File file, Object obj) {
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();//удаляем содержимое файла
            
            FileOutputStream os = new FileOutputStream(file, true);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(obj);
            
            bw.append(json);
            bw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Object getElement(File file, Class cl) {
        Object data=new Object();
        try {
            Gson GSON=new GsonBuilder().setPrettyPrinting().create();
            JsonReader reader = new JsonReader(new FileReader(file));
            
            data = GSON.fromJson(reader, cl);
            
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            return data;
        }
    }
}
