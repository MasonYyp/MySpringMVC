package ltd.ruiaixinan.ecg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("indexController")
@RequestMapping("/my")
public class IndexController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		System.out.println("********");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		return mv;
		
	}
}
