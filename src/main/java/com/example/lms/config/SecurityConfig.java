package com.example.lms.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails author = User.withDefaultPasswordEncoder()
                .username("author")
                .password("password1")
                .roles("AUTHOR")
                .build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("password2")
                .roles("ADMIN")
                .build();
        UserDetails student= User.withDefaultPasswordEncoder()
                .username("student")
                .password("password3")
                .roles("STUDENT")
                .build();
        UserDetails faculty = User.withDefaultPasswordEncoder()
                .username("faculty")
                .password("password4")
                .roles("FACULTY")
                .build();

        return new InMemoryUserDetailsManager(author, admin, student, faculty);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/*", "localhost:8080/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/author/**").hasAnyRole("AUTHOR", "ADMIN")
                        .requestMatchers("/student/**").hasAnyRole("STUDENT","ADMIN")
                        .requestMatchers("/faculty/**").hasAnyRole("ADMIN","FACULTY")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
