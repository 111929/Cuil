package com.example.cuil.service;

import org.springframework.stereotype.Service;

@Service
public class CuilService {
	
	public String verificarPersona(String numero, String tipoPersona) {
		String resultado="";
		Integer ultimo= (int) Math.floor(Math.random()*10);
		String inicio="";
		if(numero.length()<=8) {
			if(tipoPersona.equals("masculino")){
				inicio="20";
			}
			else if(tipoPersona.equals("femenino")) {
				inicio="27";
			}
			else if(tipoPersona.equals("juridico")) {
				inicio="30";
			}
			resultado=(new StringBuilder()).append(inicio).append(numero).append(ultimo.toString()).toString();
		}else {
			resultado=numero;
		}
		return resultado;
	}
}
