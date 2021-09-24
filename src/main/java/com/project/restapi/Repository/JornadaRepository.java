package com.project.restapi.Repository;

import com.project.restapi.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JornadaRepository  extends JpaRepository<JornadaTrabalho, Long> {

}
