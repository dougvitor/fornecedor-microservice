package br.com.home.microservice.fornecedor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.home.microservice.fornecedor.model.InfoFornecedor;
import br.com.home.microservice.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	private static final Logger LOG = LoggerFactory.getLogger(InfoService.class);
	
	@Autowired
	private InfoRepository repository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		LOG.info("Buscando informações do fornecedor....");
		return repository.findByEstado(estado);
	}

}
