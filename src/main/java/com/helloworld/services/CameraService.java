package com.helloworld.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.helloworld.entities.Camera;
import com.helloworld.repositories.CameraRepository;

@Service
public class CameraService {
	
	@Autowired
	private CameraRepository cameraRepository;
	
	public List<Camera> findAll() {
		return cameraRepository.findAll();
	}
	
	public Camera save(Camera camera) {
		return cameraRepository.save(camera);
	}
	
	
	
}
