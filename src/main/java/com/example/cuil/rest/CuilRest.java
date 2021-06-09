package com.example.cuil.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuil.service.CuilService;

@RestController
public class CuilRest {
	@Autowired
	private CuilService cuilService;
	
	@GetMapping(path = "/cuil")
	public ResponseEntity<String> verificarCuil(@RequestParam String numero, @RequestParam String tipoPersona){
		String resultado = cuilService.verificarPersona(numero, tipoPersona);
		return ResponseEntity.ok(resultado);
	}
	
}
