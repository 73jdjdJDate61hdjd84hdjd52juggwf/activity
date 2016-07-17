package org.activity.admin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.api.IGiftFront;
import com.jumore.b2b.activity.service.business.io.request.GiftReq;

public class Consumer {

	
	public static void main(String[] args)throws Exception { 

	        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"spring/dubbo-consumer.xml"}); 

	        context.start(); 

	        IGiftFront giftApi = (IGiftFront)context.getBean("giftFront");// 获取远程服务代理 

	        Pages<?> page = giftApi.browser(new GiftReq(), 0, 10);// 执行远程方法 

	  

	        System.out.println( page );// 显示调用结果 

	    } 
}
