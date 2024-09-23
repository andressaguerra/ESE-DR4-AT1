package br.edu.infnet.petfriends.almoxarifado.repository;

import br.edu.infnet.petfriends.almoxarifado.model.PedidoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoEstoqueRepository extends JpaRepository<PedidoEstoque, Long> {
}
