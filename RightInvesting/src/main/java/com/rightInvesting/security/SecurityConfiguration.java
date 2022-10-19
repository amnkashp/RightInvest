package com.rightInvesting.security;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter 
{
	//@Autowired
	//private DataSource securityDataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		//auth.jdbcAuthentication().dataSource(securityDataSource);
		
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
			//.withUser("admin").password("{noop}admin").roles("ADMIN");
			.withUser(users.username("emp").password("emp").roles("EMPLOYEE"))
			.withUser(users.username("admin").password("admin").roles("ADMIN"));
			
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/public/**").permitAll()      		//hasRole("EMPLOYEE")
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/signin").permitAll()
			//.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/signin")
				.loginProcessingUrl("/authenticateTheUser");
			//.httpBasic();
		/*
			.formLogin()
				.loginPage("/showMyLoginPage")
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll()
				.and()
				.logout()
				.permitAll()
				.and()
				.exceptionHandling()
				.accessDeniedPage("/failed");
				
		*/		
	}
}	
	

