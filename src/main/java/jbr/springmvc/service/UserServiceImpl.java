package jbr.springmvc.service;

import org.springframework.stereotype.Service;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService {

    
    public User validateUser(Login login) {
		return null;
        // Method logic here
         // Sample return
    }

    @Override
    public void register(User user) {
        // Method logic here
    }
}

