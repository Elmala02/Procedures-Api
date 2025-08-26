package com.example.crudprueba;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {

	

}
