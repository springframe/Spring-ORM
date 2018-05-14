package com.contactmgmt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.contactmgmt.config.RootConfig;
import com.contactmgmt.dto.ContactDTO;
import com.contactmgmt.entity.Contact;
import com.contactmgmt.service.ContactService;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(RootConfig.class);
		ContactService cservice=ctx.getBean("service",ContactService.class);
		ContactDTO cdto=new ContactDTO();
		  cdto.setContactId(1);
		  cdto.setContactName("Mansur");
		  cdto.setAdressLine1("Ameerpet");
		  cdto.setAdressLine2("Ameerpet2");
		  cdto.setCity("Hyderabd");
		  cdto.setState("TS");
		  cdto.setZip(825318);
		  cdto.setCountry("India");
		  cdto.setMobileNumber(9784423);
		  System.out.println(cdto);
		  System.out.println(cservice.saveContact(cdto));
	}

}
