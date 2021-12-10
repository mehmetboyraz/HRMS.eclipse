package kodlamaio.HRMS.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	
	JobPosition getByCompanyName(String company_name );
	
	JobPosition getByCompanyNameAndJobNames_jobNameId(String company_name , int job_names_id);
	
	List<JobPosition> getByIsActıve(Boolean is_active);
	
	List<JobPosition> getByCompanyNameOrJobNames(String companyName , int job_names_id);
	
	List<JobPosition> getByOrderByDeadlineAsc();
	
	List<JobPosition> getByOrderByDeadlineDesc();
	
	
}