<%@page contentType="text/html" import="model.*"  pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
   <h1>New Student to System</h1>
    <form action="confirm.jsp" method="POST">
        <label>Student ID</label><input type="text" name="id"/><br>
        <label>Student Name</label><input type="text" name="name"/><br>
        <label>Student gender</label><input type="radio" name="gender" value="M"/>Male<input type="radio" name="gender" value="F"/>Female<br>
        <label>Student DOB</label><input type="text" name="dob"/><br>
        <input type="submit" value="Add" />
    </form>
    </section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
