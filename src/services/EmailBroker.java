package services;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.mail.MailException;

import org.springframework.stereotype.Service;

/**
 * @author 794471
 *
 * Service class that handles sending emails
 */
@Service
public class EmailBroker
{
	private JavaMailSender jms;
	
	/**
	 * default constructor that instantiates a JavaMailSender
	 */
	public EmailBroker()
	{
	    JavaMailSenderImpl jmsi = new JavaMailSenderImpl();
	    jmsi.setHost("smtp.gmail.com");
	    jmsi.setPort(587);
	     
	    jmsi.setUsername("EmergingTrendsINTP2020@gmail.com");
	    jmsi.setPassword("password123.");
	     
	    Properties property = jmsi.getJavaMailProperties();
	    property.put("mail.transport.protocol", "smtp");
	    property.put("mail.smtp.auth", "true");
	    property.put("mail.smtp.starttls.enable", "true");
	    property.put("mail.debug", "false");
	     
	    this.jms = jmsi;
	}
	
	/*
    public void sendMail(String to, String subject, String body) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        
        jms.send(message);
    }
    */
    
	// send email for successful application -> volunteer, foster, dog, cat
	/**
	 * sends a confirmation email to a supplied email address with a template based on the option
	 * 
	 * @param to
	 * @param option
	 * @return a boolean based on the outcome of the operation 
	 */
	public boolean sendConfirmation(String to, String option) 
	{
		String subject = "";
		String body = "";
		
		if(option.equals("volunteer"))
		{
			subject = "Volunteer Application Confirmation";
			body = "<html>"
					+ "<head><meta charset=\"utf-8\" /><title>Volunteer Application</title></head>"
					+ "<body>Thank you for applying. <br><br> We have recieved your application and will be processing it shortly. <br> You will be notified by email if your application is accepted. <br><br> Calgary Animal Rescue Society: <a href=\"https://calgaryanimalrescue.com/\">https://calgaryanimalrescue.com/</a></body>"
					+ "</html>";
		}
		else if(option.equals("foster"))
		{
			subject = "Foster Application Confirmation";
			body = "<html>"
					+ "<head><meta charset=\"utf-8\" /><title>Foster Application</title></head>"
					+ "<body>Thank you for applying. <br><br> We have recieved your application and will be processing it shortly. <br> You will be notified if your application is accepted. <br><br> Calgary Animal Rescue Society: <a href=\"https://calgaryanimalrescue.com/\">https://calgaryanimalrescue.com/</a></body>"
					+ "</html>";
		}
		else if(option.equals("dog"))
		{
			subject = "Dog Adoption Application Confirmation";
			body = "<html>"
					+ "<head><meta charset=\"utf-8\" /><title>Dog Adoption Application</title></head>"
					+ "<body>Thank you for applying. <br><br> We have recieved your application and will be processing it shortly. <br> You will be notified by phone if your application is accepted. <br><br> Calgary Animal Rescue Society: <a href=\"https://calgaryanimalrescue.com/\">https://calgaryanimalrescue.com/</a></body>"
					+ "</html>";
		}
		else if(option.equals("cat"))
		{
			subject = "Cat Adoption Application Confirmation";
			body = "<html>"
					+ "<head><meta charset=\"utf-8\" /><title>Cat Adoption Application</title></head>"
					+ "<body>Thank you for applying. <br><br> We have recieved your application and will be processing it shortly. <br> You will be notified by phone if your application is accepted. <br><br> Calgary Animal Rescue Society: <a href=\"https://calgaryanimalrescue.com/\">https://calgaryanimalrescue.com/</a></body>"
					+ "</html>";
		}

		return sendEmail(to, subject, body);
	}
	
	/**
	 * sends a welcome email to a supplied email address with a template based on the option
	 * 
	 * @param to
	 * @param option
	 * @return a boolean based on the outcome of the operation 
	 */
	public boolean sendWelcome(String to, String option)
	{
		String subject = "";
		String body = "";
		
		if(option.equals("volunteer"))
		{
			subject = "Welcome to the Calgary Animal Rescue Society";
			body = "<html>"
					+ "<head><meta charset=\"utf-8\" /><title>Welcome to CARS</title></head>"
					+ "<body>Hello! <br><br>Your volunteer application has been accepted.<br>Please go to {link to site} and reset your password to sign in.<br><br>We look forward to working with you!</body>"
					+ "</html>";
		}
		else if(option.equals("foster"))
		{
			subject = "Welcome to the Calgary Animal Rescue Society";
			body = "<html>"
					+ "<head><meta charset=\"utf-8\" /><title>Welcome to CARS</title></head>"
					+ "<body>Hello! <br><br>Your foster application has been accepted.<br>Please go to {link to site} and reset your password to sign in.<br><br>We look forward to working with you!</body>"
					+ "</html>";
		}
		
		return sendEmail(to, subject, body);
	}
	
	/**
	 * creates and sends an email
	 * 
	 * @param to
	 * @param subject
	 * @param body
	 * @return a boolean based on the outcome of the operation 
	 */
    private boolean sendEmail(String to, String subject, String body) 
    {
    	boolean success = false;
    	
        MimeMessagePreparator preparator = new MimeMessagePreparator() 
        {
            public void prepare(MimeMessage mimeMessage) throws Exception 
            {
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                mimeMessage.setFrom(new InternetAddress("EmergingTrendsINTP2020@gmail.com"));
                mimeMessage.setSubject(subject);
                mimeMessage.setContent(body, "text/html");
            }
        };
         
        try 
        {
            jms.send(preparator);
            success = true;
        }
        catch (MailException ex) 
        {
        	success = false;
        	System.out.println("Error in sendEmail.");
            //System.err.println(ex.getMessage());
        }
        
        return success;
    }
}
