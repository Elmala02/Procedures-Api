package com.example.crudprueba;

import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class ProcedureService {
 
	@Autowired
	ProcedureRepository procedureRepository;
	
	public List<Procedure> getProcedure(){
		return procedureRepository.findAll();
	}
	public Optional<Procedure> getProcedure(Long id){
		 return procedureRepository.findById(id);
	}
 
	public void saverOrUpdate(Procedure procedure) {
		procedureRepository.save(procedure);
	}
	
	public void delete(Long id) {
		procedureRepository.deleteById(id);{
			}
		}
	
}
