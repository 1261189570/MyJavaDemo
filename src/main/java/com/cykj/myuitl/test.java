package com.cykj.myuitl;

import com.cykj.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //第一种
        Class<?> user = Class.forName("com.cykj.bean.User");
        //第二种
        Class<?> userClass = User.class;
        //第三种
        Class<?> user2 = new User().getClass();

        //通过Class对象的newInstance方法获取这个类对象
        Object o = userClass.newInstance();

        //通过Constructor对象，来获取类对象
        Constructor<?> constructor = userClass.getConstructor(String.class,Integer.class);
        //拿到类实例
        Object o1 = constructor.newInstance("李四",2);
        //获取这个类所有的方法（不包括系统默认方法）
        Method[] methods=userClass.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            Object invoke = method.invoke(o);
            System.out.println("返回值: "+method.getName());
        }



        //获取这个类所有public方法（包括系统默认方法）
        Method[] methods2=userClass.getMethods();
        //获取这个类的指定方法
        Method methods3=userClass.getDeclaredMethod("iii",String.class);
        Object invoke = methods3.invoke(o1,"555");
        System.out.println(invoke);
    }
}
