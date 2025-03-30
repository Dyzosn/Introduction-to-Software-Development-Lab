<%@page import="model.User"%>

<html>
    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String colour = request.getParameter("colour");
        String tos = request.getParameter("tos");
        // Create a User JavaBean instance
        User user = new User(name, email, password, gender, colour);
        session.setAttribute("user", user);
    %>
    <body bgcolor = <%= colour %> >
        <%-- check if user agrees to TOS --%>
        <%
            if (tos != null && tos.equals("on")) {
        %>
            <h1>
                Welcome, <%= name %>, good day! <br>
                Your Email is <%= email %>. <br>
                Your password is <%= password %>.</br>
                Your gender is <%= gender %>.</br>
                Your favourite colour is <%= colour %>.</br>
                Click <a href="index.jsp">here</a> to proceed to the main page. <br />
            </h1>
        <%-- if TOS is not agreed to --%>
        <%
            } else {
        %>
            <h1> 
                Sorry, you have to agree to our TOS </br>
                Click <a href = "register.jsp">here</a> to go back.
            </h1>
        <%
            }
        %>
    </body>
</html>