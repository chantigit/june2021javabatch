

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class L1 implements ServletRequestListener, HttpSessionListener, ServletContextListener {

    public L1() {
    	System.out.println("L1.L1()");
    }
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("L1.requestDestroyed()");
    }
    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("L1.requestInitialized()");
    }
    public void sessionCreated(HttpSessionEvent se)  {
    	System.out.println("L1.sessionCreated()");
    }
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("L1.sessionDestroyed()");
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("L1.contextDestroyed()");
    }
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("L1.contextInitialized()");
    }
}
