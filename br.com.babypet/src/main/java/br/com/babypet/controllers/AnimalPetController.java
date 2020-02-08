package br.com.babypet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.babypet.domain.AnimalPet;
import br.com.babypet.dtos.commands.AnimalPetInsertCommand;
import br.com.babypet.services.AnimalPetService;
import br.com.babypet.services.ClienteService;

@RestController
@RequestMapping("animais")
public class AnimalPetController {

	@Autowired
	private AnimalPetService animalPetService;
	
	@Autowired
	private ClienteService clienteService;

	public ResponseEntity<?> inserir(@RequestBody AnimalPetInsertCommand command) {

		clienteService.adicionalAnimal(command);
        //Model
		return ResponseEntity.ok().build();
	}

}
