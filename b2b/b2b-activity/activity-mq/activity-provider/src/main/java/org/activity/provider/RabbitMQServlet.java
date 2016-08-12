package org.activity.provider;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import me.poplaris.rabbitmq.client.EventControlConfig;
import me.poplaris.rabbitmq.client.exception.SendRefuseException;
import me.poplaris.rabbitmq.client.impl.DefaultEventController;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 系统启用初始化类
 * 
 * @author fanwg
 * @date 2013-8-21 上午10:18:16
 * @email renntrabbit@foxmail.com
 */
public class RabbitMQServlet extends HttpServlet {

	private static final long serialVersionUID = -7949539847167271621L;
	private final Logger logger = Logger.getLogger(RabbitMQServlet.class);


	private String defaultHost = "127.0.0.1";
	
	
	private EventControlConfig eventControlConfig;
	private DefaultEventController controller;
	
	@Resource
	private IConsumer consumer;
	
	@Override
	public final void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		logger.info("<context-param>-<param-name>:"+config.getInitParameter("log4jConfigLocation"));
		
		ServletContext servletContext = this.getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		logger.info("#########################");
		logger.info("##系统初始化");
		logger.info("##");
		logger.info("##  初始化消费者队列");
		
		if (consumer==null){
			consumer = (IConsumer) ctx.getBean("registerAip");
		}
		eventControlConfig = new EventControlConfig(defaultHost);
		controller = DefaultEventController.getInstance(eventControlConfig);
		initAllCache();

		logger.info("##");
		logger.info("#########################");

		if (logger.isDebugEnabled()) {
			logger.debug("Servlet '" + getServletName() + "' configured successfully");
		}
	}

	public void initAllCache() {
		
			//消息创造者
			//EventTemplate eventTemplate = controller.getEopEventTemplate();
			//注册消息消费
			controller.add(RegisterAip.REGISTER_EXCHANGE, RegisterAip.REGISTER_QIEIE, consumer);
			controller.start();
			
			/*SysSetting setting=new SysSetting();
			setting.setAttribute("rabbitmq");
			setting.setCategory("test");
			setting.setKey("mq");
			setting.setSqrt(0);*/
			
			try {
				controller.getEopEventTemplate().send(RegisterAip.REGISTER_EXCHANGE, RegisterAip.REGISTER_QIEIE, null);
			} catch (SendRefuseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	@Override
	public final void destroy() {
		super.destroy();
		try {
			controller.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
