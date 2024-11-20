<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
        
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
    
    
    <jsp:include page= "header.jsp" />
        <%
         String login_error= (String) request.getAttribute("model_error");
        
         %>
        
        
        
        <div class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-4"> </div>
                    <div class="col-4 d-flex justify-content-center">
                        <div class="login_div_design bg-light">
                        
                        
                            <h3> Login Here </h3> <br/>
                            
                       <form action="/loginForm" method ="get">
                            <div class="mb-3">
                                <label class="form-label">Enter Email</label>
                                <input type="text" name="email1" class="form-control"/> 
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Enter Password</label>
                                <input type="text" name="pass1" class="form-control"/> 
                                <div class="form-text"> We will not share your email id with anyone... </div>
                            </div>
                            <input type="submit" value="Login" class="btn btn-primary" />
                            
                            <% if( login_error!=null) 
								{
  							%>                        
							

							  <h5 style ="color:red;"><%=login_error %></h5>
							<%
								}
							%>
                            
                      </form>
                            
                        </div>
                    </div>
                    <div class="col-4"> </div>
                </div>
            </div>
        </div>
    </body>
</html>