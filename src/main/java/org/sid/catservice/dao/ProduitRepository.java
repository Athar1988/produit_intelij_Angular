package org.sid.catservice.dao;
import org.sid.catservice.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
