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
 
@WebServlet(urlPatterns = { "/managetrainings" })
public class ManageTrainingsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public ManageTrainingsServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/managetrainings.jsp");
        dispatcher.forward(request, response);    
        TrainingInfo trainingInfo = new TrainingInfo();
                
     }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}
