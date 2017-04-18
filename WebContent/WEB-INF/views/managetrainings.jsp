<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Training Page</title>
  </head>
  <body> 
     <jsp:include page="_header.jsp"></jsp:include>     
     <h3>Training Management</h3>
     <h2>Search:</h2>     
     <form action="searchtrainings" method ="POST">
	     <label>Training Code : </label>
	     <input name="training_id" type="text" value="${trainingInfo.trainingId}"></input>
	     <label>Instruction Type : </label>
	     <input name="training_type" type="text" value="${trainingInfo.trainingType}"></input>
	     <label>Training Payment Type: </label>
	     <input name="training_cost_type" type="text" value="${trainingInfo.trainingCostType}"></input>
	     <br>
	     <input type="submit" value="Search"></input>
     </form>     	
       
     <jsp:include page="_footer.jsp"></jsp:include>
  </body>
</html>