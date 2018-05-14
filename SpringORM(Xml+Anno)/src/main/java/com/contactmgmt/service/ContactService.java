package com.contactmgmt.service;
import java.util.ArrayList;
import java.util.List;

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
	public List<ContactDTO> getById(int id)
	{    ContactDTO cdto=new ContactDTO();
	     List<ContactDTO> lcdto=null;           
		List<Contact> lc=cd.getContact(id);
		for(Contact c: lc)
		{
			lcdto=new ArrayList<>();
		cdto.setContactId(c.getContactId());
		cdto.setContactName(c.getContactName());
		cdto.setAdressLine1(c.getAdressLine1());
		cdto.setAdressLine2(c.getAdressLine2());
		cdto.setCity(c.getCity());
		cdto.setState(c.getState());
		cdto.setZip(c.getZip());
		cdto.setCountry(c.getCountry());
		cdto.setMobileNumber(c.getMobileNumber());
		lcdto.add(cdto);
		//convert contact to dto
		}
		
		return lcdto;
		
	}
	
}
