package com.dock.test.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dock.test.domain.Terminal;
import com.dock.test.services.TerminalServices;

@RestController
@RequestMapping(value="/terminais")
public class TerminalResources {
	
	@Autowired	
	private TerminalServices service;

	@RequestMapping(value="/{logic}",method=RequestMethod.GET)
	public ResponseEntity<Terminal> find(@PathVariable Integer logic) {
		Terminal obj = service.find(logic);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody String body){
		
		Terminal obj = service.insert(body);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{logic}").buildAndExpand(obj.getLogic()).toUri();		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{logic}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Terminal obj,@PathVariable Integer logic){
		obj.setLogic(logic);
		obj = service.update(obj);		
		return ResponseEntity.noContent().build();
	}
	
	/*@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Terminal> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}*/
}

