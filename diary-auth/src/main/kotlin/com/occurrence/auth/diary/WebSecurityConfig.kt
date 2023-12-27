package com.occurrence.auth.diary

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
            .withUser("thiago")
            .password(passwordEncoder().encode("123"))
            .roles("ADMIN")
            .and()
            .withUser("joao")
            .password(passwordEncoder().encode("123"))
            .roles("ADMIN")
    }

//    @Throws(Exception::class)
//    override fun configure(http: HttpSecurity) {
//        http
//            .httpBasic()
//            .and()
//            .authorizeRequests()
//            .antMatchers("/ocorrencia/ola/**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .sessionManagement()
//            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//            .and()
//            .csrf().disable()
//    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}
