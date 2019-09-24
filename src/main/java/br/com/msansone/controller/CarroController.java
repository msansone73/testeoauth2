package br.com.msansone.controller;

import br.com.msansone.model.Carro;
import br.com.msansone.repository.CarroRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carro/")
public class CarroController {

    @Autowired
    CarroRepository carroRepository;

    @GetMapping("/ler/{id}")
    public Carro lerPorId(@PathVariable Long id){
        return carroRepository.findById(id).get();
    }
    
    @GetMapping("/ler")
    public List<Carro> lerTudo(){
        return carroRepository.findAll();
    }

    @PostMapping("/inserir/")
    public Carro inserir(@RequestBody Carro carro){
        return carroRepository.save(carro);
    }
}
