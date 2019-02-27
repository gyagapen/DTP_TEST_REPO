package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface  ProductDao extends JpaRepository<Product, Integer> {


    //@Query("SELECT id, nom, prix FROM Product  p where p.prix > :prixLimit");
    //List<Product> chercherUnProduitCher(@Param("prixLimit") int prix);

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);
    public Product deleteById(int id);
    List<Product> findByPrixGreaterThan(int prixLimit);
    List<Product> findByNomLike(String recherche);


}
