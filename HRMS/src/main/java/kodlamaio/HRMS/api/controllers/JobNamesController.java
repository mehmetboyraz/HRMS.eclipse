package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HRMS.business.abstracts.JobNamesService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.JobNames;

@RestController
@RequestMapping("api/JobNames")
public class JobNamesController {
	private JobNamesService jobNamesService;
	@Autowired
	public JobNamesController(JobNamesService jobNamesService) {
		super();
		this.jobNamesService = jobNamesService;
	}
	
	@GetMapping("/getAll")
	public dataResult<List<JobNames>> getAll(){
		return this.jobNamesService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobNames jobNames) {
		return this.jobNamesService.add(jobNames);
	}
	
	
	
} 
