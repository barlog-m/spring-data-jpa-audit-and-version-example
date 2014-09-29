package li.barlog.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@EntityListeners({AuditingEntityListener.class})
public class User extends AbstractAuditable<User, Long> {
	@Basic
	@Column
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String data) {
		this.name = data;
	}

	@Version
	@Column
	private Long version;
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "User {" +
				"id='" + getId() + "', " +
				"name='" + getName() + "'} ";
	}
}
