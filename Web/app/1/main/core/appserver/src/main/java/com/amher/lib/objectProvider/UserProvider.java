package com.amher.lib.objectProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.amher.business.bean.User;
import com.amher.business.bean.UserList;

public class UserProvider {
	
	private static Map<Long, User> allUsers;
	
	static {
		allUsers = new HashMap<Long, User>();
		User u1 = new User(1L, "Yucheng Wang", "ycwmike@gmail.com");
		User u2 = new User(2L, "George Lin", "gglin@gmail.com");
		allUsers.put(u1.getId(), u1);
		allUsers.put(u2.getId(), u2);
	}
	
	public void add(User u) {
		allUsers.put(u.getId(), u);
	}

	public User get(long id) {
		return allUsers.get(id);
	}

	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		for( Iterator<User> it = allUsers.values().iterator(); it.hasNext(); ) {
			User u = it.next();
			users.add(u);
		}
		return users;
	}

	public void remove(long id) {
		allUsers.remove(id);
	}

	public void update(User u) {
		allUsers.put(u.getId(), u);
	}

}
