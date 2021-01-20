package com.helloworld.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.entities.Local;
import com.helloworld.services.LocalService;

@RestController
@RequestMapping("/locals")
public class LocalController {
	
	@Autowired
	private LocalService service;
	
	@GetMapping
	public ResponseEntity<List<Local>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
	}
	
	@GetMapping("/{id")
	public ResponseEntity<Local> getById(@PathVariable UUID id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Local> create(@RequestBody Local obj) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(obj));
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Local> update(@PathVariable UUID id, @RequestBody Local obj) {
		return ResponseEntity.status(HttpStatus.OK).body(service.update(id, obj));
	}
	
}
