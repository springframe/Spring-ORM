package com.contactmgmt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages= {"com.contactmgmt.dao","com.contactmgmt.service"})
@Import(PersistencyConfig.class)
public class RootConfig {

}
