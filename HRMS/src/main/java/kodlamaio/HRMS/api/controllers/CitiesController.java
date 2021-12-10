package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.HRMS.business.abstracts.CitiesService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.dataResult;
import kodlamaio.HRMS.entities.concretes.Cities;

@RestController
@RequestMapping("/api/Cities")
public class CitiesController {
	private CitiesService citiesServicce;
	@Autowired
	public CitiesController(CitiesService citiesServicce) {
		super();
		this.citiesServicce = citiesServicce;
	}
@GetMapping("/getAll")
public dataResult<List<Cities>> getAll(){
	return this.citiesServicce.getAll();
}
@PostMapping("/add")
public Result add(@RequestBody Cities cities) {
	return this.citiesServicce.add(cities);
}
}
