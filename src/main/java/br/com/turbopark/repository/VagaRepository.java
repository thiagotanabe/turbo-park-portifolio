package br.com.turbopark.repository;

import br.com.turbopark.entities.VagasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VagaRepository extends JpaRepository<VagasEntity, Long> {
}

