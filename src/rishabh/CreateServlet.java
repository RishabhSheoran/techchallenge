package rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.codehaus.jackson.map.ObjectMapper;

import ravi.model.TestJson;
import ravi.model.User;
@WebServlet(name = "CreateServlet")
public class CreateServlet extends HttpServlet{
	 protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		 
	      
	    }

	    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
	    	response.setContentType("application/json");
	    	PrintWriter out = response.getWriter();
	        String eventUrl = (String) request.getParameter("eventUrl");
	        System.out.println(eventUrl);
	        ObjectMapper mapper = new ObjectMapper();
	        TestJson testJson = new TestJson();
	        testJson.setEventUrl(eventUrl);
	        String json = mapper.writeValueAsString(testJson);
	        out.print(json);
	    	
	    	
	    	
	    	
	    	
	    	
	    	/*	 response.setContentType("application/json");
	         PrintWriter out = response.getWriter();
	         ObjectMapper mapper = new ObjectMapper();
	         User u1 = new User(1, "ravi");
	         String json = mapper.writeValueAsString(u1);
	         out.print(json);
      */   
	    }
	    
	    
	    //Heroku platform for cloud to deploy application
}
