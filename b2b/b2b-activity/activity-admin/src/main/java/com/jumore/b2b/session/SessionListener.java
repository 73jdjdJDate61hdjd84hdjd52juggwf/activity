package com.jumore.b2b.session;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 
 * @author fanwg
 * @date 　　2016年7月26日　上午10:08:57
 * @email renntrabbit@foxmail.com
 */
public class SessionListener implements HttpSessionListener {
	/**
	 * 单例
	 */
	public static SessionContext sessionContext = SessionContext.instance;

	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		sessionContext.AddSession(httpSessionEvent.getSession());
	}

	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		sessionContext.DelSession(httpSessionEvent.getSession());
	}
}