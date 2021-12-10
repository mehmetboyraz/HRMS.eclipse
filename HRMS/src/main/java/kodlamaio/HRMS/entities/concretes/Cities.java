package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_positions"})
@PrimaryKeyJoinColumn(name="city_id")
@Table(name="cities")
public class Cities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int city_id;
	public String city_name;
	@JsonManagedReference
	public int city_plate;

	@OneToMany(mappedBy = "cities")
	private List<JobPosition> jobPosition;
	
	
	
}
