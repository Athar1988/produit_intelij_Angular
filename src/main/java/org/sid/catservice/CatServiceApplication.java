package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {


    @Autowired
    private ProduitRepository iproduitrepository;
    @Autowired
    private RepositoryRestConfiguration repConfig;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repConfig.exposeIdsFor(Produit.class);
         iproduitrepository.save(new Produit(null, "Livre", 2000, 5));
        iproduitrepository.save(new Produit(null,"cahier", 250, 4));
        iproduitrepository.save(new Produit(null,"stylo",560,3));
        iproduitrepository.save(new Produit(null,"gomme",230,6));
        iproduitrepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });
    }
}
