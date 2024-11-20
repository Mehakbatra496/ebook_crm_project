<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>User Profile</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        <div class="container-fluid bg-primary header_design">
            <div class="container">
                <div class="row">
                    <div class="col-3">
                        <a href="login" class="navbar-brand text-light"> CRM Application </a>
                    </div>
                    <div class="col-6"> </div>
                    <div class="col-3">
                        <a class="navbar-brand text-light" href="#">
                        <img src="${pageContext.request.contextPath}/images/admin_profile_pic.png" alt="Profile Picture" style="width:40px;" class="rounded-pill">
														
							<c:choose>
							    <c:when test="${session_employee == 'Admin'}">
							        Welcome Admin
							    </c:when>
							    <c:otherwise>
							        Welcome oh wow nice ${session_employee.name}
							  
							    </c:otherwise>
							</c:choose>
                        </a>
                        
                        <a href="login" class="text-light">Logout</a>
                    </div>
                </div>
            </div>
        </div>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark container-fluid">
            <div class="container">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                    
                    	  <li class="nav-item">
                            <a class="nav-link" href="adminHomePage">Home</a>
                        </li>
                    
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Employees</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="addEmployee">Add Employee</a></li>
                                <li><a class="dropdown-item" href="empList">Employee's List</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Products</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Add Products</a></li>
                                <li><a class="dropdown-item" href="#">Products's List</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Complaints</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    </body>
</html>