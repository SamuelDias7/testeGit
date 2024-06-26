package com.project.springWeb.Repository;

import com.project.springWeb.ProductModel.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Pessoa, Integer> {

    @Override
    Iterable<Pessoa> findAll();

    Pessoa findByid(int id);
}
