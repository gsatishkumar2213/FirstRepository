package com.sidgs.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="NewStudent1")
@DiscriminatorValue(value = "new_student")
//@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
//		@AttributeOverride(name = "name", column = @Column(name = "name")) })
@PrimaryKeyJoinColumn(name="id")
public class NewStudent extends Student {
	private int fees;
	private String noDis;

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getNoDis() {
		return noDis;
	}

	public void setNoDis(String noDis) {
		this.noDis = noDis;
	}

}
