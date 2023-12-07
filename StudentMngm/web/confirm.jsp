<%@page contentType="text/html" import="model.*"  pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<jsp:useBean id="student" class="model.Student" scope="session"/> 
<jsp:setProperty name="student" property="*"/>
<!-- start the middle column -->

<section>
   <h1>Information of new Student </h1>
    <form action="addStudent" method="POST">
        <label>Student ID</label>${student.id}<br>
        <label>Student Name</label>${student.name}<br>
        <label>Student Gender</label>${student.gender}<br>
        <label>Student Dob</label>${student.dob}<br>
        <input type="submit" value="Confirm" />&nbsp;
        <input type="Button" value="Back" onclick="javascript:history.go(-1);">
    </form>
    </section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
