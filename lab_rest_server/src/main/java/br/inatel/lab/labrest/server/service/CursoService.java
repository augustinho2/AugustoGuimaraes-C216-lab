package br.inatel.lab.labrest.server.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class CursoService {
	
	private Map<Long, Curso> mapa = new HashMap<>();
	
	public List<Curso> pesquisarCurso() {
		
	}
}
