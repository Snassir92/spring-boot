package com.example.crud.repository;
import com.example.crud.model.Doges;
import org.springframework.data.repository.CrudRepository;
public interface DogeRepository extends CrudRepository<Doges, Long> {
}