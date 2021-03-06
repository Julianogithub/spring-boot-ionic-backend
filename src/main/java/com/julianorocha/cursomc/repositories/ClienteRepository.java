package com.julianorocha.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.julianorocha.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
	
	//@Transactional(readOnly=true)
	//@Query("SELEC obj.pedidos FROM Cliente obj WHERE obj.id =id")
	//List<Pedido> FindByClienteId(@Param("id") Integer id);
	
}

