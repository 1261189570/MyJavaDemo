package com.cykj.myuitl;

import org.dom4j.Element;

import java.util.Iterator;

public class test2 {

    public static void main(String[] args) {
        Element root=MappingUtils.fetchXml();
        Element foo;
        //遍历包含table的节点
        for(Iterator i=root.elementIterator("table");i.hasNext();){
             foo = (Element) i.next();
             //获取当前节点属性为name，并调用fetchInsertSql方法
             String sql=MappingUtils.fetchInsertSql(foo.attributeValue("name"));
            System.out.println(sql);
        }
    }

}
