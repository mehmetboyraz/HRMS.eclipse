package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.JobNames;

public interface JobNamesDao extends JpaRepository<JobNames, Integer> {

}
