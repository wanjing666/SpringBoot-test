package com.wj.sugar.sugarroot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author CP_WJ 
* @version 创建时间: 2017年10月20日下午1:55:27
* 类说明：
* 	helloWorld !
*/
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping
	public String index(){
		return "Hello World !";
	}
}
