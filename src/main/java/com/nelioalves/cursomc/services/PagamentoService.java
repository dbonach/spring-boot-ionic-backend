package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Pagamento;
import com.nelioalves.cursomc.repositories.PagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository repo;
	
	public Pagamento insert(Pagamento obj) {
		return repo.save(obj);
	}
}
