package com.sidgs.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="OldStudent1")
@DiscriminatorValue(value = "old_student")
//@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
//		@AttributeOverride(name = "name", column = @Column(name = "name")) })
@PrimaryKeyJoinColumn(name="id")
public class OldStudent extends Student {
	private int dis;
	private String job;

	public int getDis() {
		return dis;
	}

	public void setDis(int dis) {
		this.dis = dis;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
