package org.vrits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BOLLAPUH
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

}
