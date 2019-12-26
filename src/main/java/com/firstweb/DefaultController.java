package com.firstweb;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DefaultDAO;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String index() { return "index"; }
	
	@RequestMapping("/board")
	public void board(Model model) {
		AbstractApplicationContext mycontxt = new GenericXmlApplicationContext("classpath:application-context.xml");
		DefaultDAO iridao = mycontxt.getBean("iridao", DefaultDAO.class);
		String cont = iridao.getContents(); 
		model.addAttribute("name", "이름직접적어쓰");
		model.addAttribute("contents", cont);
	}

	@RequestMapping("/board2")
	public ModelAndView mvtest() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "이름뭐");
		mv.setViewName("reply");
		return mv;   
		// 이건 왜 굳이 이렇게 하는지 모르겠음. 걍 String 타입으로 선언하고 jsp페이지 리턴하면 되는거 아닌가?
	}
	
}
