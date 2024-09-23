package br.edu.infnet.petfriends.transporte.repository;

import br.edu.infnet.petfriends.transporte.model.PedidoTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoTransporteRepository extends JpaRepository<PedidoTransporte, Long> {
}