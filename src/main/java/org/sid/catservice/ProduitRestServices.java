package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
public class ProduitRestServices {
    @Autowired
    private ProduitRepository PR;

    // retourner liste des produits
    @GetMapping(value="/listProduit")
    public List<Produit> listProduits(){
        return PR.findAll();
    }

    //retourner un produit
    @GetMapping(value ="/listProduit/{reference}")
    public Produit RetourneProduit(@PathVariable(name="reference") Long reference){
        return PR.findById(reference).get();
    }

    //Mettre à jour un produit
    @PutMapping(value ="/listProduit/{reference}")
    public Produit UpdateProduit(@PathVariable(name="reference") Long reference, @RequestBody Produit P){
        P.setReference(reference);
        return PR.save(P);
    }

    //Enregistrer un produit
    @PostMapping(value ="/listProduit")
    public Produit SaveProduit(@RequestBody Produit P){
        return PR.save(P);
    }

    //Supprimer un produit
    @DeleteMapping(value ="/listProduit/{reference}")
    public void DeleteProduit(@PathVariable(name="reference") Long reference){
         PR.deleteById(reference);
    }

}
