package com.ltts.DemoSpringCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       Employee e=(Employee) context.getBean("emp1");
      Employee e1=(Employee) context.getBean("emp2");
       System.out.println(e);
       System.out.println(e1);
    }
}
