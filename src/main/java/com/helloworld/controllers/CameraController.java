package com.helloworld.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.entities.Camera;
import com.helloworld.services.CameraService;

@RestController
@RequestMapping("/cameras")
public class CameraController {
	
	@Autowired
	private CameraService cameraService;
	
	@GetMapping
	public ResponseEntity<List<Camera>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(cameraService.findAll());
				
	}
	
	@PostMapping
	public ResponseEntity<Camera> create(@RequestBody Camera obj) {
		return ResponseEntity.status(HttpStatus.CREATED).body(cameraService.save(obj));
	}
}
