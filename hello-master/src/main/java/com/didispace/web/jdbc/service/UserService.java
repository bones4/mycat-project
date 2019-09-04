//package com.didispace.web.jdbc.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//
//import com.didispace.web.jdbc.mapper.UserMapper;
//import com.didispace.web.jdbc.po.User;
//
//import java.util.UUID;
//
//@Service
//public class UserService {
//	@Autowired
//	private UserMapper userMapper;
//
//	@Cacheable(value="user", key="'user'")
//    public User selectByPrimaryKey(Integer id) {
//        System.out.println("开始查询.....");
////        try {
////            Thread.sleep(3 * 1000l);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
////        for (int i = 0; i <10000 ; i++) {
////            User user2=new User();
////            user2.setName(UUID.randomUUID().toString());
////            userMapper.insert(user2);
////        }
//
//
//
//        User user=userMapper.selectByPrimaryKey(id);
//        System.out.println("查询结束......");
//
//        return user;
//    }
//
//}
