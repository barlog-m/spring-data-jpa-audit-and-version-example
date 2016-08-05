package li.barlog.config;

import li.barlog.audit.AuditorAwareImpl;
import li.barlog.domain.User;
import li.barlog.service.CurrentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"li.barlog.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class AppConfig {
	@Bean
	public AuditorAware<User> auditorProvider(@Autowired CurrentUserService currentUserService) {
		return new AuditorAwareImpl(currentUserService);
	}
}
