package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello2alec")
	@ResponseBody
	public String hello() {
		return "Hello 기술노트with알렉 유투브 화이팅! 2024년 내년에는 꼭 오프라인 강의 해보려고 합니다. ";
	}
}
