package com.jp.listeners.listen;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountForLiveSessions
 *
 */
@WebListener
public class CountForLiveSessions implements HttpSessionListener {

  
  
    public CountForLiveSessions() {
    	System.out.println("Listerner Created.");
    }

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session Created.");		
		HttpSession session = arg0.getSession();
		
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		
		System.out.println("Session Destroyed.");		
	}
	
}