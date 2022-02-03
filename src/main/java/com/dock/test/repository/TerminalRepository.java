package com.dock.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dock.test.domain.Terminal;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal,Integer>{
	
	

}
