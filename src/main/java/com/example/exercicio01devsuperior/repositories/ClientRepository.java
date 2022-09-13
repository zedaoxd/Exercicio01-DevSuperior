package com.example.exercicio01devsuperior.repositories;

import com.example.exercicio01devsuperior.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
