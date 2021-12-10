package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

@RestController
@RequestMapping("api/JobSeeker")
public class JobSeekerController {
	
	private JobSeekerService jobSeekerService;
	@Autowired
	public JobSeekerController(JobSeekerService jobSekeerService) {
		super();
		this.jobSeekerService=jobSekeerService;
	}
	
	@GetMapping("/getAll")
	public dataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) throws Exception {
		return this.jobSeekerService.add(jobSeeker);
	}
}
