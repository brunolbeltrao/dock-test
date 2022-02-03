package com.dock.test.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dock.test.domain.Terminal;
import com.dock.test.repository.TerminalRepository;
import com.dock.test.services.exception.ObjectNotFoundException;


@Service
public class TerminalServices {

	@Autowired
	private TerminalRepository repo;

	public Terminal find(Integer logic) {
		Optional<Terminal> obj = repo.findById(logic);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! logic: "+logic+", Tipo: "+Terminal.class.getName()));
	}
	
	public Terminal insert(String body) {
		Terminal terminal = new Terminal(body);	
		/*if (terminal.getModel().isBlank()){
			return terminal.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! logic: "+logic+", Tipo: "+Terminal.class.getName()));
		}*/
		return repo.save(terminal);
	}
	
	public Terminal update(Terminal obj) {
		find(obj.getLogic());		
		return repo.save(obj);
	}
	
}
