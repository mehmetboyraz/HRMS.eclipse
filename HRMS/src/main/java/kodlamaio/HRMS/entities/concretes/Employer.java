package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name= "employer")

public class Employer extends User {
	
private String company_name;
private String web_sıte;
private String phone_number;

public Employer() {}
public Employer(String company_name, String web_sıte, String phone_number) {
	super();
	this.company_name = company_name;
	this.web_sıte = web_sıte;
	this.phone_number = phone_number;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public String getWeb_sıte() {
	return web_sıte;
}
public void setWeb_sıte(String web_sıte) {
	this.web_sıte = web_sıte;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
}