package com.wj.sugar.sugarroot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.wj.sugar.sugarroot.web.HelloWorldController;

/**
* @author CP_WJ 
* @version 创建时间: 2017年10月20日下午2:27:53
* 类说明：
* 	HelloWorldController测试类
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldTests {
	
	private MockMvc mvc;
	
	@Before
	public void setUp(){
		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}
	
	@Test
	public void getHello() throws Exception{
		String str = mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse().getContentAsString();
		System.out.println("结果是："+str);
	}
}
