<%!String username=null,password=null;%>
<%
username=request.getParameter("uname");
password=request.getParameter("pwd");
%>
<%
if(username.equals("john")&& password.equals("testpass"))
response.sendRedirect("Welcome.jsp");
else
out.println("<center><h4>Invalid username or password</h2></center>");
%>