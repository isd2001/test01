package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*
 * 	
 */
public class WelcomeController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("handleRequest..");
		
		ModelAndView mav = new ModelAndView();
			mav.setViewName("/WEB-INF/views/welcome.jsp");		// view �� ��� ����� ����
			mav.addObject("data","Spring MVC");					// view ���� ��ߵ� �����͸� ����
		request.setAttribute("data2", 512546);
		
		return mav;
	}
	
	
}
