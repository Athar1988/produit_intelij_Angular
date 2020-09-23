package org.sid.catservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
    public class Produit implements Serializable {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long reference;
        private String designation;
        private double prix;
        private int quantite;
}
