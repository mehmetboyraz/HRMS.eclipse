package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="job_seeker")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobSeeker extends User{
		@Column(name="birth_year")
		private int birth_year;
		@Column(name="name")
		private String name;
		@Column(name="last_name")
		private String last_name;
		@Column(name="identity_number")
		private long identity_number;
		
		public JobSeeker() {}
		public JobSeeker(int user_id, int birth_year, String name, String last_name, long identity_number) {
			super();
		
			this.birth_year = birth_year;
			this.name = name;
			this.last_name = last_name;
			this.identity_number = identity_number;
		}
	
		public int getBirth_year() {
			return birth_year;
		}
		public void setBirth_year(int birth_year) {
			this.birth_year = birth_year;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public long getIdentity_number() {
			return identity_number;
		}
		public void setIdentity_number(long identity_number) {
			this.identity_number = identity_number;
		}
		

}

