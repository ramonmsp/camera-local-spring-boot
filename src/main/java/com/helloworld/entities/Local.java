package com.helloworld.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.helloworld.enumerations.LocalTypes;

import lombok.Data;

@Entity
@Table(name = "local")
@Data
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@NotNull
	@NotBlank
	private String name;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private LocalTypes type;
	
//	@OneToOne
//	private Local associatedLocals;

}
