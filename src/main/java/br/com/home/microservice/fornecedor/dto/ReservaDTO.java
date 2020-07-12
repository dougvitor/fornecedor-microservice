package br.com.home.microservice.fornecedor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {

	public Integer idReserva;
	
	public Integer tempoDePreparo;

	
}
