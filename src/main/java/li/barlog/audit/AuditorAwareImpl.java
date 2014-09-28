package li.barlog.audit;

import li.barlog.domain.User;
import li.barlog.service.CurrentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<User> {
	@Autowired
	private CurrentUserService currentUserService;

	@Override
	public User getCurrentAuditor() {
		return currentUserService.getCurrentUser();
	}
}
