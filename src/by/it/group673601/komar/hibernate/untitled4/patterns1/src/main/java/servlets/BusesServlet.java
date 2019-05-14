package servlets;


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
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

@WebServlet("/timetable")
public class BusesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Table table=new BusTable();
            req.setAttribute("timetable", table.print());
        }
        catch (JAXBException e){
            System.out.println(e.getMessage());
        }
        req.getRequestDispatcher("TimetableWindow.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type=req.getParameter("type");
        String select=req.getParameter("select");
        String result=new String();
        req.setCharacterEncoding("utf-8");
        try {
            Table table=new BusTable();
            req.setAttribute("name", "автобусов");
            String partOfTable="<th>Цена</th>\n" +
                    "            <th>Марка автобуса</th>\n" +
                    "            <th>Время в пути</th>";
            if (type.equals("train")) {
                table = new TrainTable();
                partOfTable="<th>Тип билета</th>\n" +
                        "            <th>Цена</th>\n" +
                        "            <th>Дата прибытия</th>\n"+
                        "            <th>Время прибытия</th>";
                req.setAttribute("name", "поездов");
            }
            req.setAttribute("partOfTable", partOfTable);
            if(select.equals("1")) result=table.print();
            if(select.equals("2")) result=table.simpleSelect(req.getParameter("place"), 0);
            if(select.equals("3")) result=table.simpleSelect(req.getParameter("place"), 1);
            if(select.equals("4")) result=table.selectInInterval(req.getParameter("begin"), req.getParameter("end"));
        }
        catch (JAXBException e){
            e.getMessage();
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
        req.setAttribute("timetable", result);
        req.getRequestDispatcher("TimetableWindow.jsp").forward(req, resp);
    }
}
