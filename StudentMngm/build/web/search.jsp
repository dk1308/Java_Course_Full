<%@page contentType="text/html" import="model.*"  pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<!-- start the middle column -->

<section>
   <h1>Student Searching</h1>
    <form action="search" method="POST">
        <label>Search criteria</label><select name="sCriteria">
            <option value="all" selected="true">All</option>
            <option value="sid">ID</option>
            <option value="name">Name</option>
            <option value="sex">Gender</option>
            <option value="dob">Date of Birth</option>
        </select><br>
        <label>Search value</label><input type="text" name="sValue"/><br>
        <input type="submit" value="Search" />
    </form>
    </section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
