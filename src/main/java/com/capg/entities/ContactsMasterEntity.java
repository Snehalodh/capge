package com.capg.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Contact_Master")

	public class ContactsMasterEntity {

	
	@Id
	  @Column(name="contact_id")
	  private Integer contactId;
	  @Column(name="contact_name")
	  private String contactName;
	  @Column(name="Contact_Number")
	  private Long contactNumber;
	 

	@Override
	public String toString() {
		return "ContactsMasterEntity [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
		
	}


	public Integer getContactId() {
		return contactId;
	}


	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public Long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public ContactsMasterEntity(Integer contactId, String contactName, Long contactNumber) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}
	public ContactsMasterEntity() {
	
	}
}