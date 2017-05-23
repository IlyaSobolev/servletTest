package com.sobolev.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExampleMain implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.print("test111111111");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
