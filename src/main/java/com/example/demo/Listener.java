package com.example.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sce){
        System.out.println("Request initialized.");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sce){
        System.out.println("Request destroyed.");
    }

}