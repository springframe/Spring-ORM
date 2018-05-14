package com.contactmgmt.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.contactmgmt.entity.Contact;

@Repository
public class ContactDAO {
	@Autowired
	private HibernateTemplate htemplate;

	@Transactional(readOnly=false)
	public int saveContact(Contact cbo)
	{
		System.out.println("dao-->"+cbo);
		
		int cnt=(int)htemplate.save(cbo);
		return cnt;	
	}
}
