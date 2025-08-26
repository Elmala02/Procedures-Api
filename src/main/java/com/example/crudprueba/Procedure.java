package com.example.crudprueba;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;

@Data
@Entity
@Table(name ="prodecures")

public class Procedure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long procedureId;
	private String typeProcedure;
	private String description;
	@Column(name ="procedure_name", unique= true,nullable = false)
	private String procedureName;
	

}
