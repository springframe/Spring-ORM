package com.contactmgmt.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactmgmt.dao.ContactDAO;
import com.contactmgmt.dto.ContactDTO;
import com.contactmgmt.entity.Contact;

@Service("service")
public class ContactService{
	
    @Autowired
	private ContactDAO cd;

	public String saveContact(ContactDTO cdto)
	{	
		Contact cbo=new Contact();
		cbo.setContactId(cdto.getContactId());
		cbo.setContactName(cdto.getContactName());
		cbo.setAdressLine1(cdto.getAdressLine1());
		cbo.setAdressLine2(cdto.getAdressLine2());
		cbo.setCity(cdto.getCity());
		cbo.setState(cdto.getState());
		cbo.setZip(cdto.getZip());
		cbo.setCountry(cdto.getCountry());
		cbo.setMobileNumber(cdto.getMobileNumber());
		System.out.println("service-->"+cbo);
		int cnt=cd.saveContact(cbo);
		if(cnt!=0)
		{
			System.out.println("cnt: "+cnt);
			return "Insert sucesessfuly";
		}
		System.out.println("cnt: "+cnt);
			return "Updatation failed";
		
	}
	
	
}
