package com.helloworld.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.entities.Local;
import com.helloworld.repositories.LocalRepository;

@Service
public class LocalService {

	@Autowired
	private LocalRepository repository;
	
	public List<Local> findAll() {
		return repository.findAll();
	}
	
	public Local save(Local obj) {
		return repository.save(obj);
	}
	
	public Local findById(UUID id) {
		Optional<Local> obj = repository.findById(id);
		if(obj.isPresent()) return obj.get();
		
		return null;
	}
	
	public Local update(UUID id, Local obj) {
		
		Optional<Local> localOptional = repository.findById(id);

		
		if(!localOptional.isPresent()) {
			return null;
		}
		
		Local local = localOptional.get();
		
		local.setId(id);
		local.setName(obj.getName());
		local.setType(obj.getType());


		return repository.save(local);
		
		
	}
	
	
}
