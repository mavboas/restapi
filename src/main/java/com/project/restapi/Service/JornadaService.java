package com.project.restapi.Service;

import com.project.restapi.Repository.JornadaRepository;
import com.project.restapi.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public  JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public  List<JornadaTrabalho> findAll() {
        return  jornadaRepository.findAll();    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
       return jornadaRepository.save(jornadaTrabalho);
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return  jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteJornadaById(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

}


