package com.smp.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.smp.beans.UserAccount;
import com.smp.beans.TrainingInfo;
 
public class DBUtils {
 
  public static UserAccount findUser(Connection conn, String userName, String password) throws SQLException {
 
      String sql = "Select a.username, a.password from login_details a "
              + " where a.username = ? and a.password= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
      pstm.setString(2, password);
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {          
          UserAccount user = new UserAccount();
          user.setUserName(userName);
          user.setPassword(password);          
          return user;
      }
      
      return null;
  }
 
  public static UserAccount findUser(Connection conn, String userName) throws SQLException {
 
      String sql = "Select a.username, a.password from login_details a " + " where a.username = ? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
 
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          String password = rs.getString("Password");          
          UserAccount user = new UserAccount();
          user.setUserName(userName);
          user.setPassword(password);          
          return user;
      }
      return null;
  }
  
  public static TrainingInfo findTrainings(Connection conn,String trainingCode,String trainingCostType,String trainingType,String
		  skillName) throws SQLException{
	  
	  TrainingInfo trainingInfo =  null;	  	  
	  int startRow,endRow=0;
	  int colCount=0;  
	  
	  
	  String sql = "select training_code,training_type,training_cost_type,Cost,skill_name,duration from trainings" +  
						"inner join training_type" + 
						"on trainings.training_type_id = training_type.training_type_id " +
						"inner join training_cost" + 
						"on trainings.training_cost_id = training_cost.training_cost_id" + 
						"inner join skills" + 
						"on trainings.skill_id = skills.skill_id" +
						"where trainings.training_code = ?" +
						"and training_cost.training_cost_type = ?" +
						"and training_type.training_type = ?"  +
						"and skills.skill_name = ?" ;			 
					  
	 PreparedStatement sqlQuery = conn.prepareStatement(sql);
	 
	 sqlQuery.setString(1, trainingCode);
	 sqlQuery.setString(2, trainingCostType);
	 sqlQuery.setString(3, trainingType);	 
	 sqlQuery.setString(4, skillName);
	 
	 ResultSet rs = sqlQuery.executeQuery();
	 rs.first();
	 startRow = rs.getRow();
	 rs.last();
	 endRow = rs.getRow();		
	 rs.first();
	 colCount = rs.getMetaData().getColumnCount();
	 trainingInfo = new TrainingInfo();
	 
	 trainingInfo.setTrainingName(rs.getString(0));
	 trainingInfo.setTrainingCategory(rs.getString(1));
	 trainingInfo.setTrainingCostType(rs.getString(2));
	 trainingInfo.setTrainingPrice(rs.getString(3));
	 trainingInfo.setSkillName(rs.getString(4));
	 trainingInfo.setTrainingDuration(rs.getString(5));
	 
	 return trainingInfo;
	 
  }  
  
   
}
