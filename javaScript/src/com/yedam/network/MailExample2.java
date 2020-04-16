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

public class MailExample2 {

		public static void main(String[] args) throws AddressException, MessagingException {
		      String host = "smtp.naver.com"; //mail서버(smtp)
		      final String user = "znvl12@naver.com"; //아이디
		      final String passwd = "ha993227!";//비번
		      
		      String toUser = "tetrodotoxi@naver.com"; //받는 메일 주소
		      
		      Properties props = new Properties();
		      props.put("mail.smtp.host", host); //smtp set 정해져있음
		      props.put("mail.smtp.port", 587); //포트
		      props.put("mail.smtp.auth", true); //유효체크
		      
		      
		      Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
		         protected PasswordAuthentication getPasswordAuthentication() {
		            return new PasswordAuthentication(user,passwd);
		         }
		      });
		      MimeMessage message = new MimeMessage(session);
		      message.setFrom(new InternetAddress(user));
		      message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));

		      message.setSubject("네이버 베일 테스트"); // 메일 제목
		      message.setText("네이버 메일 내용 부분"); // 내용
		      Transport.send(message); // 매일 발송..
		      System.out.println("mail sended.......");
		   }

}
