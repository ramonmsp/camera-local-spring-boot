package com.helloworld.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helloworld.entities.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Camera, UUID>{
	
}
