package com.contactmgmt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.contactmgmt.entity.Contact;

@Configuration
public class PersistencyConfig {

	@Bean
	public DataSource newDataSource()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.OracleDriver");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dmds.setUsername("springhibernate");
		dmds.setPassword("springhibernate");
		return dmds;
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sesFactory=null;
		Properties hibernateProperties=null;
		hibernateProperties=new Properties();
	/*	hibernateProperties.setProperty("hibernate.show_sql","true");
		hibernateProperties.setProperty("hibernate.formate_sql","true");*/
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","create");
		hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.OracleDialect");
		
		sesFactory=new LocalSessionFactoryBean();
		sesFactory.setHibernateProperties(hibernateProperties);
		sesFactory.setAnnotatedClasses(Contact.class);
		return sesFactory;
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public HibernateTemplate htemplate()
	{
		HibernateTemplate ht=new HibernateTemplate();
		
		return ht;
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager pftManager()
	{
		return new HibernateTransactionManager();
		
	}
}
