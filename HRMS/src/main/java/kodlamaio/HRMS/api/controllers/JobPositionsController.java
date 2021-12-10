package kodlamaio.HRMS.api.controllers;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;

import kodlamaio.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/jobPositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService=jobPositionService;
	}
	
	@GetMapping("/getAll")
	public dataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
		
	}
	@PostMapping("/add") 
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
	@GetMapping("/getByJobPositionCompanyName")
	public dataResult<JobPosition> getByCompanyName(@RequestParam String companyName){
		
		return this.jobPositionService.getByCompanyName(companyName);
	}
	@GetMapping("/getByCompanyNameAndJobNames")
	public dataResult<JobPosition> getByCompanyNameAndJobNames(@RequestParam String companyName , @RequestParam int job_names_id){
		return this.jobPositionService.getByCompanyNameAndJobNames(companyName, job_names_id);
	}
	@GetMapping("/getIsActıve")
	public dataResult<List<JobPosition>> getIsActıve(Boolean isActıve){
		return this.jobPositionService.getByIsActıve(isActıve);
	}
	 @GetMapping("/getByDeadlineAsc")
	    dataResult<List<JobPosition>> getByDeadlineAsc(){
	        return this.jobPositionService.getByOrderByDeadlineAsc();
	    }
	 @GetMapping("/getByDeadlineDesc")
	    dataResult<List<JobPosition>> getByDeadlineDesc(){
	        return this.jobPositionService.getByOrderByDeadlineDesc();
	    }
}