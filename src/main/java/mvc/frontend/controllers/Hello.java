package mvc.frontend.controllers;

import mvc.frontend.mvc.mapping.Mapping;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	static private Logger logger = Logger.getLogger(Hello.class);

	@RequestMapping(value = "/")
	public String home() {
		logger.info("HomeController: Passing through...");
		return Mapping.HOME;
	}
}
