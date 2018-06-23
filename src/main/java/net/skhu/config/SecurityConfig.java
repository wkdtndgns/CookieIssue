package net.skhu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import net.skhu.mysql.service.AuthProvider;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired AuthProvider authProvider;

	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/img/**");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/cookie/admin/**").hasRole("ADMIN")
			.antMatchers("/cookie/user/**").hasRole("USER")
			.antMatchers("/cookie/common/**").hasAnyRole("ADMIN", "USER")
			.antMatchers("/cookie/guest/**").anonymous()
			.antMatchers("/cookie/").permitAll();

		http.csrf().disable();

		http.formLogin()
			.loginPage("/cookie/guest/login")
			.loginProcessingUrl("/cookie/guest/login_process")
			.failureUrl("/cookie/guest/login?error")
			.defaultSuccessUrl("/cookie/common/index", true)
			.usernameParameter("loginId")
			.passwordParameter("passwd");

		http.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/cookie/common/logout_process"))
			.logoutSuccessUrl("/cookie/guest/index")
			.invalidateHttpSession(true);

		http.authenticationProvider(authProvider);

	}
}
