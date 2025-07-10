//package com.springProject.service.impl;
//
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//public class LoginServiceImpl implements UserDetailsService {
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Replace this with DB or user service
//        if ("user".equals(username)) {
//            return new User("user", new BCryptPasswordEncoder().encode("password"), new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found");
//        }
//    }
//}
//}
