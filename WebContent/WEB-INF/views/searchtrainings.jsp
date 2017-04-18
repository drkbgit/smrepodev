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

       <label>${trainingInfo.trainingId} </label>
     <jsp:include page="_footer.jsp"></jsp:include>
  </body>
</html>