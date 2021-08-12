package com.dio.live.Service;

import com.dio.live.Repository.JornadaRepository;
import com.dio.live.model.Jornadatrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }
    public Jornadatrabalho saveJornada(Jornadatrabalho jornadaTrabalho){
    return jornadaRepository.save(jornadaTrabalho);

    }
    public  List<Jornadatrabalho> findall(){ return jornadaRepository.findAll();}

    public  Optional<Jornadatrabalho> getByid(Long idJornada) {return jornadaRepository.findById(idJornada);};

     public Jornadatrabalho updateJornada(Jornadatrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }




    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}


