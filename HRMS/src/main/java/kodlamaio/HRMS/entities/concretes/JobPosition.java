package kodlamaio.HRMS.entities.concretes;






import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name ="job_positions")
@PrimaryKeyJoinColumn(name="id")
public class JobPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="salary")
	private int salary;
	@Column(name="company_name")
	private String companyName;
	@Column(name="explanation")
	private String explanation;
	@Column(name="employee_need")
	private int employeeNeed;
	@Column(name="deadline")
	private Date deadline;
	@Column(name="is_active")
	private Boolean isActıve;
//	private int job_names_id;
	
	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name="job_names_id")
	private JobNames jobNames;
	
	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name="city_plate")
	private Cities cities;

}