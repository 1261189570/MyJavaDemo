package com.cykj.myuitl;

import com.cykj.bean.Document;
import com.cykj.bean.User;
import com.cykj.mapper.DocumentMapper;
import com.cykj.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class test4 {
    public static void main(String[] args) {

        SqlSession session = MybatisUtil.getInstance().getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = mapper.userByDocument();

        for (User user : list) {
            System.out.println("-------------------------------------");
            System.out.println(user);
            for (Document document : user.getDocumentList()) {
                System.out.println(document);
            }

        }

    }
}
