package com.jumore.b2b.session;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.mock.web.MockHttpSession;

/**
 * 
 * @author fanwg
 * @date 　　2016年7月26日　上午9:54:55
 * @email renntrabbit@foxmail.com
 */
public class SessionManagerHelper {
	public static void sessionHandlerByCacheMap(SysAdmin admin, HttpSession session) {
		Object userid = session.getAttribute("userid");
		if (userid != null) {

			// 如果用户是否在别处登录
			HttpSession beforeSession = SessionListener.sessionContext.getSessionMap().get(userid);
			if (beforeSession != null && beforeSession.getId().equals(session.getId())) {

				SessionListener.sessionContext.getSessionMap().remove(userid);
				SessionListener.sessionContext.getSessionKeyMap().remove(beforeSession.getId());
				//此处不能直接注册
				//beforeSession.invalidate();
				// 方法一。将原用户的userbean对角清除
				beforeSession.removeAttribute("");
				//方支二，模拟该用户执行一次退出操作
				
			}
		}
		// 根据当前sessionid 取session对象。 更新map key=用户名 value=session对象 删除map
		session.setAttribute("userid", admin.getName());
		 userid = session.getAttribute("userid");
		SessionListener.sessionContext.getSessionMap().put(userid.toString(), session);
		SessionListener.sessionContext.getSessionKeyMap().put(session.getId(), userid.toString());
	}
	/**
	 * 按插入顺序的map测试数据
	 */
	public static HashMap<String,HttpSession> testDate(){
		HashMap<String , HttpSession> map = new  LinkedHashMap<String, HttpSession>();
		
		for(int i=0; i<100;i++){
		   HttpSession session=new MockHttpSession() ;
		   String key=RandomStringUtils.randomNumeric(3);
		   map.put(key, session);
		   System.out.println(key+","+session.getId());
		}

		return map;
		
		
	}
	
}
