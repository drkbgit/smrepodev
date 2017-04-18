package com.smp.servlet;
 
import java.io.IOException;
 
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 

import com.smp.beans.UserAccount;
import com.smp.beans.TrainingInfo;
import com.smp.util.DBUtils;
import com.smp.util.MyUtils;
 
@WebServlet(urlPatterns = { "/searchtrainings" })
public class TrainingSearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public TrainingSearchServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	TrainingInfo trainingInfo = new TrainingInfo();
    	String trainingId;
    	String trainingType;
    	String trainingCostType;
    	String skillName;        
        
        trainingId = request.getParameter("trainingId");
        trainingCostType = request.getParameter("trainingCostType");
        trainingType = request.getParameter("trainingType");        
        skillName = request.getParameter("skillName");
        System.out.println("trainingId" + trainingId);
        System.out.println("trainingCostType" + trainingCostType);
                
        try{
        	Connection conn = MyUtils.getStoredConnection(request);
        	trainingInfo = DBUtils.findTrainings(conn, trainingId, trainingCostType, trainingType, skillName);
        	System.out.println("traininginfo.duration" + trainingInfo.getTrainingName());
        	System.out.println("traininginfo.duration" + trainingInfo.getTrainingPrice());
        	System.out.println("traininginfo.duration" + trainingInfo.getTrainingCostType());
        	System.out.println("traininginfo.duration" + trainingInfo.getTrainingCategory());

        }catch(SQLException e){
        	System.out.println("SQL ERROR" + e.getMessage());
        }   
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/searchtrainings.jsp");
        response.sendRedirect(request.getContextPath() + "/searchtrainings");
        dispatcher.forward(request, response);   
        
     }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}
