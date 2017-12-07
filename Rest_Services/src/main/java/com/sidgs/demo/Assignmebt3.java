package com.sidgs.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignmebt3 {
	User user = new User();
	@RequestMapping(value = "/Test", method = RequestMethod.POST)
	public HttpStatus getHomePage(@RequestBody String name , HttpSession session) {
		session.setAttribute("name", name );
		session.setMaxInactiveInterval(60);
		return HttpStatus.ACCEPTED;
	}
	
	@RequestMapping("/getName")
	public String getName(HttpSession http){
	String fname = (String) http.getAttribute("name");
	if(fname!= null)
		return fname;
	else
		return "kanna";
	}

	@RequestMapping("/Date")
	public String getDate(){
		DateFormat view = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	  
		return view.format(new Date());
	}
	@RequestMapping("/getTimezone")
	public String getTimeZone(){
		return TimeZone.getDefault().getDisplayName();
	}
	@RequestMapping("/getIp")
	public String getIp(){
		String ip = null;
		try {
			ip= InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ip;
	}
}
