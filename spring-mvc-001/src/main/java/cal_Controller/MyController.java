package cal_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@ResponseBody

public class MyController {
	@RequestMapping("/add")
	public void service1(ServletRequest req, ServletResponse res) throws IOException {
		//public String service1(@RequestParam double n1,@RequestParam double n2){
		//return "SUB IS :"+(n1+n2);
		//}
		double num1= Double.parseDouble(req.getParameter("n1"));
		double num2= Double.parseDouble(req.getParameter("n2"));
		PrintWriter pw = res.getWriter();
		pw.write("<h1> SUM is: "+(num1+num2)+"</h1>");
	}

	@RequestMapping("/sub")
//	public void service2(ServletRequest req, ServletResponse res) throws IOException {
//		double num1= Double.parseDouble(req.getParameter("n1"));
//		double num2= Double.parseDouble(req.getParameter("n2"));
//		PrintWriter pw = res.getWriter();
//		pw.write("<h1> Substraction is: "+(num1-num2)+"</h1>");
//	}
	@ResponseBody
	public String service2(@RequestParam double n1,@RequestParam double n2){
		return "SUB IS :"+(n1-n2);
		}

	@RequestMapping("/mul")
//	public void service3(ServletRequest req, ServletResponse res) throws IOException {
//		double num1= Double.parseDouble(req.getParameter("n1"));
//		double num2= Double.parseDouble(req.getParameter("n2"));
//		PrintWriter pw = res.getWriter();
//		pw.write("<h1> Multiplication is: "+(num1*num2)+"</h1>");
//	}
	public ModelAndView service3(@ModelAttribute Number n) {//model attribute is responsible to create object
		double n1=n.getN1();
		double n2=n.getN2();
		ModelAndView mav=new ModelAndView("Display.jsp");//view--("Display.jsp")
		mav.addObject("res","MUL IS:"+(n1*n2));//model--("res","MUL IS:"+(n1*n2))
		return mav;
	}

	@RequestMapping("/div")
//	public void service4(ServletRequest req, ServletResponse res) throws IOException {
//		double num1= Double.parseDouble(req.getParameter("n1"));
//		double num2= Double.parseDouble(req.getParameter("n2"));
//		PrintWriter pw = res.getWriter();
//		pw.write("<h1> Division is: "+(num1/num2)+"</h1>");
//	}
	

	public String service4(@RequestParam double n1,@RequestParam double n2,Model m) {//container is responsible for create object
		m.addAttribute("res","DIV IS:"+(n1/n2));
		return "Display.jsp";
	}

}
