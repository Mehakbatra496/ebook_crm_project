package com.example2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.example2.entity.Employee;
import com.example2.service.EmpService;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.entity.Employee;
import com.example2.repository.EmpRepository;

@Controller
public class MainController {
	
	String myemail, mypass, result;
	String eemail, epass, ephone, ename;
	
  	@GetMapping("/")
	public  String openIndexPage()
	{
		return "index";
	}
  	
 	@GetMapping("/ss")
	public  String opensuccessPage()
	{
		return "error-page";
	}
  	
	@GetMapping("/ff")
	public  String openerrorPage()
	{
		return "success-page";
	}
  	

 	@GetMapping("/kk")
	public  String openkkPage()
	{
		return "success-page";
	}
	@GetMapping("/login")
	public String login() {
	    return "login"; // This would resolve to /views/login.jsp if using the view prefix/suffix you configured
	}
	

	@GetMapping("/profile")
	public String profile() {
	    return "admin-home-page"; // This would resolve to /views/login.jsp if using the view prefix/suffix you configured
	}
	
	
	
	@GetMapping("/loginForm")
	public String loginInData(@RequestParam("email1") String myemail, @RequestParam("pass1") String mypass, Model model,HttpSession session) 
	{
		String page="error-page";
		if(myemail.equals("admin@gmail.com")&&mypass.equals("111"))
		{
			session.setAttribute("session_employee", "Admin");

			page="admin-home-page";
		}
		else
		{			
			Employee emp= empService.login(myemail);
			if(emp!=null&&emp.getPassword().equals(mypass))
			{
				session.setAttribute("session_employee", emp);
				page="header-admin";
			}
			else
			{
				model.addAttribute("model_error", "invalid Email or password");
				page="login";
			}
		}
				
		return page;
		// This would resolve to /views/login.jsp if using the view prefix/suffix you configured

	}
	
	@GetMapping("/addEmployee")
	public String openAddEmployeePage(Model model)
	{
		// model.addAttribute("modelEmpAttr", new Employee());
		return "add-employee-page"; 
	}
	

	@Autowired
	EmpService empService;
	
	
	@GetMapping("/registerEmployee") // to add an employee
	public String registerEmp(@RequestParam("name1") String ename , @RequestParam("email1") String eemail, @RequestParam("phoneno1") String ephone, @RequestParam("pass1") String epass, Model model )
	{
		String page="error-page";
		Employee emp = new Employee();
		emp.setName(ename);
		emp.setEmail(eemail);
		emp.setPhone(ephone);
		emp.setPassword(epass);
		
		boolean status = empService.addEmployeeService(emp);
		if(status)
		{
			model.addAttribute("model_success", "Employee added successfully");
			page="success-page";
		}
		else
		{
			model.addAttribute("model_error", "Employee not added due to some error");
		}			
		
		return page;
	}
	
	
	int PAGE_SIZE = 5;
	@GetMapping("/empList")
	public String openEmpListPage(Model model, @RequestParam(defaultValue = "1") int page)
	{
		List<Employee> list_emp = empService.getAllEmployeesService();
		
		int TOTAL_PRODUCTS = list_emp.size();
		int TOTAL_PAGES = (int) Math.ceil((double) TOTAL_PRODUCTS / PAGE_SIZE); // at one page
		
		
		int LIST_START_INDEX = (page - 1) * PAGE_SIZE;
		int LIST_END_INDEX = Math.min(LIST_START_INDEX + PAGE_SIZE, TOTAL_PRODUCTS);
		
		List<Employee> new_list_emp = list_emp.subList(LIST_START_INDEX, LIST_END_INDEX);
		
		model.addAttribute("model_list_emp", new_list_emp);
		model.addAttribute("model_total_pages", TOTAL_PAGES);
		model.addAttribute("model_current_page", page);
		
		return "employee-list";
	}
			
	@GetMapping("/adminHomePage")
	public String displayAdminHomePage()
	{
		return "admin-home-page"; 
	}
	
	//	String eemail, epass, ephone, ename;
}
