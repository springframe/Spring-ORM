package com.contactmgmt.dao;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.contactmgmt.entity.Contact;

public class ContactDAO {
	private HibernateTemplate htemplate;

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}
	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
	@Transactional
	public int saveContact(Contact cbo)
	{
		System.out.println("dao-->"+cbo);
		
		int cnt=(int)htemplate.save(cbo);
		return cnt;	
	}
}
