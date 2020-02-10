package com.dsj.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maven1 {
	
	@RequestMapping("one")
	public String index() {
		return "one";
	}
}
