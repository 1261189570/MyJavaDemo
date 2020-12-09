package com.cykj.myuitl;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.List;

public class test3 {

    public static void main(String[] args) {

        try {
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sessionFactory.openSession(false);
            UserMapper mapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.setUserId(new BigDecimal(8));
//            user.setUserAccount("123");
//            user.setUserPassword("123");
//            user.setUserState(new BigDecimal(2));
//            mapper.updateUser(user);
//            int i = mapper.deleteUserById(user);
//            System.out.println(i);
//            List<User> all = mapper.findAll();
//            for (User user : all) {
//                System.out.println(user.getUserId());
//            }
//            mapper.addUser(user);
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
