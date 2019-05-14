package servlets;

import model.SingleTone.SingleToneList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SingleToneList singleToneList=SingleToneList.getInstance(10);
        try{
            String[] checkboxes=req.getParameterValues("listOfBuses");
            for(int i=0;i<checkboxes.length;i++){
                singleToneList.removeBus(checkboxes[i]);
            }
        }
        catch(NullPointerException e){
            String[] checkboxes=req.getParameterValues("listOfTrains");
            for(int i=0;i<checkboxes.length;i++){
                singleToneList.removeTrain(checkboxes[i]);
            }
        }
        finally {
            doGet(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SingleToneList singleToneList=SingleToneList.getInstance(10);
        req.setAttribute("timetableBuses", singleToneList.print(1));
        req.setAttribute("timetableTrains", singleToneList.print(2));
        req.getRequestDispatcher("ListWindow.jsp").forward(req,resp);
    }
}
