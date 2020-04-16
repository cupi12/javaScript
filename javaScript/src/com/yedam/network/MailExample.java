package com.yedam.network;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailExample {
	public static void main(String[] args) throws AddressException, MessagingException {
		String host = "smtp.naver.com"; // mail서버(smtp)
		final String user = "znvl12@naver.com"; // 네이버 ID
		final String passwd = "ha993227!"; // 네이버 password

		String toUser = "znvl12@naver.com";// 받는 메일 주소

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.prot", 587); // 네이버포트는 587
		props.put("mail.smtp.auth", true); // 메일 서버를 쓰려고하면 true
		props.put("mail.transport.protocol", "smtp");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {  
				return new PasswordAuthentication(user, passwd);
			}
		});
		

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));

		message.setSubject("제목"); // 제목
		message.setText("내용"); // 내용
		Transport.send(message); // 메일 발송
		System.out.println("mail sended");
	}
}
