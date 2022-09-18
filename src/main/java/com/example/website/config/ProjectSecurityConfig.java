package com.example.website.config;

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.http.MatcherType.mvc;


@Configuration
public class ProjectSecurityConfig  {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

        /*Allowing the page to be accessible*/
        /*http.authorizeRequests().anyRequest().permitAll().
                and().formLogin().and().httpBasic(); */


        /*Denying the page to be accessible*/
        /*http.authorizeRequests().anyRequest().denyAll().
                and().formLogin().and().httpBasic();*/

        /*Customizing the security configuration*/
        http.csrf().disable()
                .authorizeRequests()
                .mvcMatchers("/home").permitAll()
                .mvcMatchers("/holidays/**").permitAll()
                .mvcMatchers("/contact").permitAll()
                .mvcMatchers("/saveMsg").permitAll()
                .mvcMatchers("/courses").authenticated()
                .mvcMatchers("/about").permitAll()
                .and().formLogin().and().httpBasic();

        return http.build();
    }


}
