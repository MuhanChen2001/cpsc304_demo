package ubc.cpsc304.group20.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    String[] staticResources = new String[] {
            "/**/*.jpg", "/**/*.png", "/**/*.svg",
            "/**/*.gif", "/favicon.ico",
            "/**/*.html", "/**/*.css", "/**/*.js"
    };

    String[] permittedEndpoints = new String[] {
            "/", "/test"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .cors()
                .and()
            .csrf()
                .disable()
            .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
            .authorizeRequests()
                .antMatchers(staticResources)
                    .permitAll()
            .antMatchers(permittedEndpoints)
                .permitAll()
            .anyRequest()
                .authenticated();
    }
}
