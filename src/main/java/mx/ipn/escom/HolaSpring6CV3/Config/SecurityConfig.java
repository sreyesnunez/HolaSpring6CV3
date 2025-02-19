package mx.ipn.escom.HolaSpring6CV3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // Permite todas las solicitudes sin autenticación
            .csrf(csrf -> csrf.disable()); // Desactiva protección CSRF (no recomendado en producción)

        return http.build();
    }
}
