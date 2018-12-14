package com.jp.listeners.listen;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountForLiveSessions implements HttpSessionListener {

	public CountForLiveSessions(){
		System.out.println("Listener created.");
	}
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("Session created.");
         HttpSession session = arg0.getSession();
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         System.out.println("Session destroyed.");
    }
}
