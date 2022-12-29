package com.vehicle.config;

import javax.servlet.http.Cookie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable().authorizeRequests().antMatchers("/signin").permitAll()
				.antMatchers("/vehicle/getallvehicle").hasAnyRole("USER", "ADMIN").antMatchers("/vehicle/**")
				.hasRole("ADMIN").anyRequest().authenticated().and().formLogin().loginPage("/signin")
				.loginProcessingUrl("/dologin").defaultSuccessUrl("/vehicle/getallvehicle");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("aswin").password(this.passwordEncoder().encode("user")).roles("USER");
		auth.inMemoryAuthentication().withUser("shubham").password(this.passwordEncoder().encode("admin"))
				.roles("ADMIN");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}

}
