package com.softmind.cfg;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class PersistencyConfig {

	@Bean
	public DataSource newDSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("springhibernate");
		ds.setPassword("springhibernate");
		return ds;
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public AnnotationSessionFactoryBean nesSfactory()
	{
		AnnotationSessionFactoryBean ses=new AnnotationSessionFactoryBean();
		Properties hproperty=new Properties();
		 hproperty.setProperty("hibernate.show_sql","true");
		 hproperty.setProperty("hibernate.format_sql","true");
		 hproperty.setProperty("hibernate.dialect","org.hibernate.dialect.OracleDialect");
		 hproperty.setProperty("hibernate.hbm2ddl.auto","create");
		
		 
		 ses.setHibernateProperties(hproperty);
		 ses.setPackagesToScan("com.softmind.entity");
		 
			
		return ses;
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public HibernateTemplate newHTemplate()
	{
		HibernateTemplate htemp=new HibernateTemplate();
		return htemp;
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager newPFTm()
	{
		return new HibernateTransactionManager();
		
	}
}
