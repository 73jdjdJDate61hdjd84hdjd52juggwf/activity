package com.jumore.b2b.session;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

public enum SessionContext {
	instance;

	private HashMap<String, HttpSession> sessionMap;
	
	private HashMap<String, String> sessionKeyMap;

	private SessionContext() {
		sessionMap = new HashMap<String, HttpSession>();
		sessionKeyMap = new HashMap<String, String>();
	}


	public synchronized void AddSession(HttpSession session) {
		if (session != null) {
			if (session.getAttribute("userid")!=null){
				sessionMap.put(session.getAttribute("userid").toString(), session);
				sessionKeyMap.put(session.getId(), session.getAttribute("userid").toString());
			}
		}
	}

	public synchronized void DelSession(HttpSession session) {
		if (session != null) {
			sessionMap.remove(session.getId());
			String userid=sessionKeyMap.get(session.getId());
			sessionKeyMap.remove(session.getId());
			if (userid!=null){
				sessionMap.remove(session.getAttribute("userid").toString());
			}
			// session.invalidate();
		}
	}

	public synchronized HttpSession getSession(String session_id) {
		if (session_id == null)
			return null;
		return (HttpSession) sessionMap.get(session_id);
	}

	public HashMap<String, HttpSession> getSessionMap() {
		return sessionMap;
	}

	public void setMymap(HashMap<String, HttpSession> sessionMap) {
		this.sessionMap = sessionMap;
	}


	public HashMap<String, String> getSessionKeyMap() {
		return sessionKeyMap;
	}


	public void setSessionKeyMap(HashMap<String, String> sessionKeyMap) {
		this.sessionKeyMap = sessionKeyMap;
	}
	
	

}