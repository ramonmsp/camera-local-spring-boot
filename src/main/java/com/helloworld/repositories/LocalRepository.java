package com.helloworld.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helloworld.entities.Local;

public interface LocalRepository extends JpaRepository<Local, UUID>{

}
