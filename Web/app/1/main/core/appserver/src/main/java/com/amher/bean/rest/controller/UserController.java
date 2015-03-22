package com.amher.bean.rest.controller;

import java.io.StringReader;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amher.business.bean.User;
import com.amher.business.bean.UserList;
import com.amher.lib.objectProvider.UserProvider;

/**
 * This class is used for Restful API User Control.
 * 
 * @author yucheng
 * @version 1
 * */

public class UserController {
	
	private static final String XML_VIEW_NAME = "users";
	
	private UserProvider userProvider;
	private Jaxb2Marshaller jaxb2Mashaller;
	
	public void setUserProvider(UserProvider userProvider) {
		this.userProvider = userProvider;
	}
	
	public void setJaxb2Mashaller(Jaxb2Marshaller jaxb2Mashaller) {
		this.jaxb2Mashaller = jaxb2Mashaller;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/user/{id}")
	public ModelAndView getUser(@PathVariable String id) {
		User e = userProvider.get(Long.parseLong(id));
		return new ModelAndView(XML_VIEW_NAME, "object", e);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/user/{id}")
	public ModelAndView updateEmployee(@RequestBody String body) {
		Source source = new StreamSource(new StringReader(body));
		User u = (User) jaxb2Mashaller.unmarshal(source);
		userProvider.update(u);
		return new ModelAndView(XML_VIEW_NAME, "object", u);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public ModelAndView addEmployee(@RequestBody String body) {
		Source source = new StreamSource(new StringReader(body));
		User u = (User) jaxb2Mashaller.unmarshal(source);
		userProvider.add(u);
		return new ModelAndView(XML_VIEW_NAME, "object", u);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
	public ModelAndView removeEmployee(@PathVariable String id) {
		userProvider.remove(Long.parseLong(id));
		List<User> users = userProvider.getAll();
		UserList list = new UserList(users);
		return new ModelAndView(XML_VIEW_NAME, "users", list);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public ModelAndView getEmployees() {
		List<User> users = userProvider.getAll();
		UserList list = new UserList(users);
		return new ModelAndView(XML_VIEW_NAME, "users", list);
	}
}