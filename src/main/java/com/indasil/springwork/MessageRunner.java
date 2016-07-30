package com.indasil.springwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {

    
    
    /**
     * Main method.
     */
    public static void main(String[] args) {
        
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/context.xml");
        
       

        SetterMessage message = (SetterMessage) applicationContext.getBean("setterMessage");
        System.out.println(message.getMessage());
        
        ConstructorMessage constructorMessage = (ConstructorMessage) applicationContext.getBean("constructorMessage");
        System.out.println(constructorMessage.getMessage());

        
    }

}
