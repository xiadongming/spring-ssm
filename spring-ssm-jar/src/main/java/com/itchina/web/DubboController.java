package com.itchina.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(method = RequestMethod.GET, value = "/dubbo")
public class DubboController {
	
	@RequestMapping("/web")
	public void getTest() {
		System.out.println("123456");
	}

}
