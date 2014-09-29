package li.barlog.domain;

import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@EntityListeners({AuditingEntityListener.class})
public class Foo extends AbstractAuditable<User, Long> {
	@Basic
	@Column
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
		return "Foo {" +
				"id='" + getId() + "', " +
				"data='" + getData() + "', " +
				"version='" + getVersion() + "', " +
				"createdDate='" + getCreatedDate() + "', " +
				"createdBy='" + getCreatedBy() + "', " +
				"lastModifiedDate='" + getLastModifiedDate() + "', " +
				"lastModifiedBy='" + getLastModifiedBy() + "'} ";
	}
}
