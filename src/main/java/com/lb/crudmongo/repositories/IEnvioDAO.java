package com.lb.crudmongo.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lb.crudmongo.models.EnvioDTO;

public interface IEnvioDAO extends MongoRepository<EnvioDTO, String>  {
}
