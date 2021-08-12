package com.dio.live.Controller;


import com.dio.live.Service.JornadaService;
import com.dio.live.model.Jornadatrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/jornada")
public class JornadaTrabalhoController{
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public Jornadatrabalho createJornada(Jornadatrabalho jornadatrabalho){
        return jornadaService.saveJornada(jornadatrabalho);
    }

    @GetMapping
    public List<Jornadatrabalho> getJornadaList(){
        return jornadaService.findall();
    }


    @GetMapping("/{idJornada}")
    public ResponseEntity<Jornadatrabalho>  getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return  ResponseEntity.ok(jornadaService.getByid(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }
    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Jornadatrabalho>) ResponseEntity.ok();

    }



}


