<%@page contentType="text/html" pageEncoding="utf-8"  import="model.*,java.util.*" errorPage="error.jsp"%>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<!-- start the middle column -->

<section>
    <h1>Student List </h1>
    <Table border="1"><TR><TH>ID</TH><TH>Name </TH><TH>Gender</TH><TH>DOB</TH><TH colspan="2">Operation</TH></TR>
    <%  ArrayList<Student> rList=(ArrayList<Student>)session.getAttribute("sList");
        for(Student s:rList){
            out.write("<TR><TD>"+s.getId()+"</TD><TD>"+s.getName()+"</TD><TD>"+s.getGender()+"</TD><TD>"+s.getDob()+"</TD>");
            out.write("<TD><A href='update.jsp?id="+s.getId()+"'>Update</TD><TD><A href='delete.jsp?id="+s.getId()+"'>Delete</TD></TR>");
        }
        out.write("</Table><A href='search'>Search more..</A>");
        
        %>
</section>    
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
