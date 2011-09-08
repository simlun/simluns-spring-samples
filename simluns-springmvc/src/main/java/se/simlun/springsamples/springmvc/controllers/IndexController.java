package se.simlun.springsamples.springmvc.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping("/")
	public String index() {
		log.debug("Hello, log!");
		return "index";
	}

}
