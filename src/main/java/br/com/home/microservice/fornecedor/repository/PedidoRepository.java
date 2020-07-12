package br.com.home.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.home.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
