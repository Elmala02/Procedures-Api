package com.example.crudprueba;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(path="api/v1/procedures")
public class ProcedureController {
	 	
	@Autowired 
	private ProcedureService procedureService;
	
	@GetMapping
	public List<Procedure>getAll(){
		return procedureService.getProcedure();
		
	}
	
	
	@GetMapping("/{procedureId}")
	public Optional<Procedure>getById(@PathVariable("procedureId") Long procedureId){
		return procedureService.getProcedure(procedureId);
		
	}
	@PostMapping
	public void saveUpdate(@RequestBody Procedure Procedure) {
		procedureService.saverOrUpdate(Procedure);
		
	}
	@DeleteMapping("{procedureId}")
	public void saveUpdate(@PathVariable("procedureId") Long procedureId) { 
		procedureService.delete(procedureId);
		
	}

}
