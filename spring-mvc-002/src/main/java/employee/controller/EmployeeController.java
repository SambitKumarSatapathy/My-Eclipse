package employee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import employee.dao.EmployeeDao;
import employee.dto.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee e) {
		ModelAndView mav = new ModelAndView("home.jsp");
		boolean res = EmployeeDao.saveEmp(e);
		if (res)
			mav.addObject("msg", "Data Saved Successfully");
		else
			mav.addObject("msg", "Something Went Wrong");
		return mav;
	}
	@RequestMapping("/get")
	public ModelAndView getEmployees() {
		ModelAndView mav = new ModelAndView("display1.jsp");
		List<Employee> emps= EmployeeDao.getAllEmployees();
		mav.addObject("emps", emps);
		return mav;
	}

}
