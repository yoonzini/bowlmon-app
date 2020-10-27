package com.club.bowlmon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {
	
	/**
	 * 메인 화면 조회
	 * @return
	 */
	@GetMapping(value =  "/")
	public String viewMain() {
		return "main";
	}

}
