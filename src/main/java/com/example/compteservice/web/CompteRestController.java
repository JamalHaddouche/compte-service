package com.example.compteservice.web;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CompteRestController {
    //@Autowired //pour faire l'injection des dépendances
    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    @GetMapping(path ="/comptes")//pôur accéeder à cette méthode on utilise une requéte de type GET
    public List<Compte> listComptes(){
        return compteRepository.findAll();//retourner la liste des comptes
    }
    @GetMapping(path ="/comptes/{id}")//pôur accéeder à cette méthode on utilise une requéte de type GET
    public Compte getComptes(@PathVariable(name = "id") Long code){
        return compteRepository.findById(code).get();//retourner la liste des comptes
    }

    @PostMapping(path="/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }
    @PutMapping(path="/comptes/{code}")
    public Compte update(@PathVariable Long code,@RequestBody Compte compte){
        compte.setCode(code);
        return compteRepository.save(compte);
    }
    @DeleteMapping(path="/comptes:{code}")
    public void delete(@PathVariable Long code){
        compteRepository.deleteById(code);
    }
}
