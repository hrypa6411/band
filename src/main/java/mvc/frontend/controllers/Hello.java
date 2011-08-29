package mvc.frontend.controllers;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	private Log4JLogger logger;

	@RequestMapping(value = "/")
	public String home() {
		logger.info("HomeController: Passing through...");
		return "WEB-INF/views/home.jsp";
	}
}
