package com.example.demo.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class emailConfig {
//	 @Bean
//	    public JavaMailSender javaMailSender() {
//	        return new JavaMailSenderImpl();
//	    }
//}
	
	@Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("manjulanannuri11@gmail.com");
        mailSender.setPassword("urse jlqf dqjj dspt");

        // Additional properties if needed
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
      //  mailSender.setJavaMailProperties(props);
        return mailSender;
	}
}


