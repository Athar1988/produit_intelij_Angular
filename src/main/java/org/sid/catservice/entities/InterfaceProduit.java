package org.sid.catservice.entities;


import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Projection(name="P1", types=Produit.class)
public interface InterfaceProduit {
    public double getPrix();
}
