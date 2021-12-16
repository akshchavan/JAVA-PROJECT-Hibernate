package main2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class school {
	private int std;
	private String Name;

	private String Division;
    private String Address;
    private String EmailId;
    private String Contact;
    @Id
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	@Override
	public String toString() {
		return "school [std=" + std + ", Name=" + Name + ", Division=" + Division + ", Address=" + Address
				+ ", EmailId=" + EmailId + ", Contact=" + Contact + "]";
	}


	

}
