package com.rabbit.message.mq;

import javax.annotation.Resource;

import org.junit.Assert;
import org.springframework.stereotype.Component;

import com.rabbit.message.IConsumer;
import com.rabbit.model.SysSetting;
import com.rabbit.service.ISysSettingService;

/**
 * 注册消息消费
 * 
 * @author Administrator
 *
 */
@Component
public class RegisterAip implements IConsumer {
	
	public final static String REGISTER_EXCHANGE = "REGISTER_EXCHANGE";//以前未声明的exchange
	public final static String REGISTER_QIEIE = "REGISTER_QIEIE";//以前未声明的queue
	
	
	@Resource
	ISysSettingService sysSettingService;
	
	@Override
	public void process(Object e) {// 消费程序这里只是打印信息
		Assert.assertNotNull(e);
		if (e instanceof SysSetting) {
			SysSetting sysSetting = (SysSetting) e;
			sysSettingService.insert(sysSetting);
			callBack();
		}
	}

	@Override
	public void callBack() {
		System.out.println("回调方法");

	}

}
