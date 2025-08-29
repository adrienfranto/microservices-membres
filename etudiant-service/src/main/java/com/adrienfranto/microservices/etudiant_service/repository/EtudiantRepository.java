package com.adrienfranto.microservices.etudiant_service.repository;

import com.adrienfranto.microservices.etudiant_service.model.Etudiant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EtudiantRepository extends MongoRepository<Etudiant,String> {
}
