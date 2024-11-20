

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add Employee Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
      
      <jsp:include page="header-admin.jsp" />
                      
                      
                      
	
        <div class="container mt-3">
			<h2> Register Employee </h2>
		</div>

        <div class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-4"> </div>
                    <div class="col-4 d-flex justify-content-center">
                       
                        <div class="login_div_design bg-light">
                             <h3>Enter Employee Details</h3>
                                                  
                       <form action="/registerEmployee" method ="get">
                             <div class="mb-3">
                                <label class="form-label">Enter Name</label>
                                <input type="text" name="name1" class="form-control"/> 
                            </div>
                            
                            <div class="mb-3">
                                <label class="form-label">Enter Email</label>
                                <input type="text" name="email1" class="form-control"/> 
                            </div>
                            
                             <div class="mb-3">
                                <label class="form-label">Enter Phone No.</label>
                                <input type="text" name="phoneno1" class="form-control"/> 
                            </div>
                            
                            <div class="mb-3">
                                <label class="form-label">Enter Password</label>
                                <input type="text" name="pass1" class="form-control"/> 
                            </div>
                            <input type="submit" value="Register Employee" class="btn btn-primary" />
                           
                      </form>
                            
                        </div>
                    </div>
                    <div class="col-4"> </div>
                </div>
            </div>
        </div>


    </body>
</html>