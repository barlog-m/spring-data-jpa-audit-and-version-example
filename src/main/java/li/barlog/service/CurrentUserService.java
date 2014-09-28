package li.barlog.service;

import li.barlog.domain.User;
import li.barlog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserService {
	private Long currentUserID = 1L;

	@Autowired
	private UserRepository userRepository;

	public User getCurrentUser() {
		return userRepository.findOne(currentUserID);
	}

	public void setCurrentUserToJohn() {
		currentUserID = 1L;
	}

	public void setCurrentUserToDoe() {
		currentUserID = 2L;
	}
}
