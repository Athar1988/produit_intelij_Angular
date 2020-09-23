package org.sid.catservice.dao;
import org.sid.catservice.entities.*;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {

    @RestResource(path="/chercher")
    public List<Produit> findByDesignationContains(@Param("mc") String motclé);


    @RestResource(path="/chercherPage")
    public Page<Produit> findByDesignation(String designation, Pageable pageable);
}
