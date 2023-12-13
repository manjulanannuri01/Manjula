package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmailDetails;
import com.example.demo.repository.EmailRepository;

@Service
public class EmailService {
	@Autowired
	    private JavaMailSender javaMailSender;
//	@Autowired
//	EmailRepository emailRepository;
	
	public String sendEmail(EmailDetails emailDetails) {
        try {
            // Send the email
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("manjulanannuri11@gmail.com");
            message.setTo(emailDetails.getToemail());
            message.setSubject(emailDetails.getSubject());
            message.setText(emailDetails.getMessage());
            javaMailSender.send(message);

            // Save the email to the database
//            EmailDetails email = new EmailDetails();
//            email.setToemail(emailDetails.getToemail());
//            email.setSubject(emailDetails.getSubject());
//            email.setMessage(emailDetails.getMessage());
//           emailRepository.save(email);
            return "Email sent and saved successfully!";
        } catch (Exception e) {
            return "Error sending email: "+ e.getMessage();
       }
}
}

