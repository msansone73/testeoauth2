package br.com.msansone.repository;

import br.com.msansone.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro,Long> {
}
