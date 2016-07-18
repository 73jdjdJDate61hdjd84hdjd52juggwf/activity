package com.rabbit.message;

import me.poplaris.rabbitmq.client.EventProcesser;

/**
 * 消息消费接口
 * @author Administrator
 *
 */
public interface IConsumer extends EventProcesser{
	/**
	 * 回调方法
	 * @return 
	 */
	abstract void callBack();


}
