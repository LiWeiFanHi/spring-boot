package org.springframework.boot.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/web")
@ResponseBody
public class WebController {
	@GetMapping(value = "/test")
	public List test() {
		List list = new ArrayList();
		list.add("这是测试");
		return list;
	}
}
