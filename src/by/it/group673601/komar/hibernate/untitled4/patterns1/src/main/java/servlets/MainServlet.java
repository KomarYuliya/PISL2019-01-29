package servlets;

import JAXB.entities.BusType;
import JAXB.entities.TrainType;
import model.AbstractFactory.BusTable;
import model.AbstractFactory.Table;
import model.AbstractFactory.TrainTable;
import model.SingleTone.SingleToneList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;

@WebServlet("/")
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      /*  try {
            SingleToneList singleToneList=SingleToneList.getInstance(1);
            Table table = new BusTable();
            if (!req.getHeader("referer").contains("bustimetable")) {
                String[] checkboxes=req.getParameterValues("listOfTrains");
                table = new TrainTable();
                for(int i=0;i<checkboxes.length;i++){
                    TrainType obj=((TrainTable) table).getData().get(Integer.parseInt(checkboxes[i]));
                    singleToneList.addTrain(obj);
                }
            }
            else {
                String[] checkboxes=req.getParameterValues("listOfBuses");
                for(int i=0;i<checkboxes.length;i++){
                    BusType obj=((BusTable) table).getData().get(Integer.parseInt(checkboxes[i]));
                    singleToneList.addBus(obj);
                }
            }
        }
        catch (JAXBException e){
            System.out.println(e.getMessage());
        }*/
      SingleToneList singleToneList=SingleToneList.getInstance(10);
      try {
          Table table = new BusTable();
          String[] checkboxes=req.getParameterValues("listOfBuses");
          if(checkboxes[0]!=null){
              for(int i=0;i<checkboxes.length;i++){
                  singleToneList.addBus(((BusTable) table).getData().get(Integer.parseInt(checkboxes[i])));
              }
          }
      }
      catch(NullPointerException e){
          Table table = new TrainTable();
          String []checkboxes=req.getParameterValues("listOfTrains");
          if(checkboxes.length!=0){
              for(int i=0;i<checkboxes.length;i++){
                  singleToneList.addTrain(((TrainTable) table).getData().get(Integer.parseInt(checkboxes[i])));
              }
          }
      }
        req.getRequestDispatcher("MainWindow.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("MainWindow.jsp").forward(req, resp);
    }
}
