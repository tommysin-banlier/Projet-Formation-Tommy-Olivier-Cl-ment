package com.intiFormation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {

	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	RequestFilter requestFilter;
	
	
	
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		
		auth.userDetailsService(userDetailsService);

	}
	
	@Override
	public void configure(HttpSecurity http)  throws Exception
	{
		http.csrf().disable().
		authorizeRequests().
		antMatchers(HttpMethod.OPTIONS).permitAll()
		.antMatchers("/api/loginUserJwt").permitAll()
		.anyRequest().authenticated()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().addFilterBefore(requestFilter, UsernamePasswordAuthenticationFilter.class)
		;
	}
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean 
	public AuthenticationManager authenticationManager() throws Exception
	{
		return super.authenticationManager();
	}
}
